package smsbahia.com.br.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import smsbahia.com.br.Util.conexao;

public class PersistenciaDao {

	private Connection con;

	public void InserirDados(ArrayList<BeanDao> list) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = conexao.abreConexao();
			con.setAutoCommit(false);

			String query = "INSERT INTO dbo.SMS (SMS_NUMERO,SMS_IDFORNECEDOR,SMS_MENSAGEM) VALUES (?,?,?)";
			ps = con.prepareStatement(query);
			int contador = 0;
			for (BeanDao bean : list) {
				contador++;
				ps.setString(1, bean.getTelefone());
				ps.setString(2, bean.getIdfornecor());
				ps.setString(3, bean.getMensagem());
				ps.addBatch();
				if ((contador % 100) == 0) {
					ps.executeBatch();
				}
			}

			ps.executeBatch();

			String query2 = "INSERT INTO dbo.EMAIL (EMAIL_NOME,EMAIL_IDFORNECEDOR,EMAIL_EMAIL_SEXO,EMAIL_MSG,EMAIL_CONTATO) VALUES (?,?,?,?,?)";

			ps = con.prepareStatement(query2);
			int contador2 = 0;

			for (BeanDao bean : list) {
				contador2++;
				ps.setString(1, bean.getNome());
				ps.setString(2, bean.getIdfornecor());
				ps.setString(3, bean.getSexo());
				ps.setString(4, bean.getMensagem());
				ps.setString(5, bean.getEmail());
				ps.addBatch();

				if ((contador2 % 100) == 0) {

					ps.executeBatch();
				}

				ps.executeBatch();
			}

			con.commit();
			ps.close();
			con.close();

		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}
			e.printStackTrace();

		} finally {
			ps.close();
		}

	}

	public void InserirArquivo(String arq_nome) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = conexao.abreConexao();

			String query = "INSERT INTO dbo.ARQUIVOS_LIDOS (ARQ_NOME) VALUES ('" + arq_nome + "')";
			ps = con.prepareStatement(query);
			ps.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ps.close();
		}

	}

	public void updateDados(ArrayList<BeanUpdate> list) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = conexao.abreConexao();
			con.setAutoCommit(false);

			ps = con.prepareStatement(
					"UPDATE dbo.SMS SET  SMS_ID_ENVIO= ?, SMS_ID_ARQ = ?, SMS_ENVIADO_SN= ?  WHERE SMS_ID = ?");

			// set the preparedstatement parameters
			int contador = 0;
			for (BeanUpdate bean : list) {
				contador++;
				ps.setString(1, bean.getId_sms());
				ps.setInt(2, bean.getArq_id());
				ps.setString(3, bean.getEnviado_SN());
				ps.setInt(4, bean.getSms_id());
				ps.addBatch();
				if ((contador % 100) == 0) {
					ps.executeBatch();
				}
			}

			/*ps = con.prepareStatement("UPDATE dbo.EMAIL SET  EMAIL_ID_ARQ = ?, EMAIL_ENVIADO_SN= ?  WHERE EMAIL_ID = ?");

			int contador2 = 0;
			for (BeanUpdate bean : list) {
				contador2++;
				ps.setInt(1, bean.getArq_id());
				ps.setString(2, bean.getEnviado_SN());
				ps.setInt(3, bean.getEmail_id());
				ps.addBatch();
				if ((contador % 100) == 0) {
					ps.executeBatch();
				}
			}*/
			ps.executeBatch();

			con.commit();
			ps.close();
			con.close();

		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (Exception e2) {
				e.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			ps.close();
		}
	}

	public int SelectArquivo(String arq_nome) throws SQLException {
		con = null;
		Statement sta = null;
		int id_resultado = 0;
		try {
			con = conexao.abreConexao();
			String query = "SELECT * FROM dbo.ARQUIVOS_LIDOS where ARQ_NOME='" + arq_nome + "'";
			sta = con.createStatement();
			ResultSet rt;
			rt = sta.executeQuery(query);

			while (rt.next()) {
				id_resultado = rt.getInt("ARQ_ID");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			con.close();
			sta.close();
		}
		return id_resultado;
	}

	public ResultSet SelectDados(int tipo) throws SQLException {
		ResultSet rt = null;
		if (tipo == 1) {

			String query = "SELECT * FROM dbo.SMS where SMS_ENVIADO_SN='N'";
			Connection con = conexao.abreConexao();
			Statement sta = con.createStatement();
			rt = sta.executeQuery(query);

		} else {
			String query = "SELECT * FROM dbo.EMAIL where EMAIL_ENVIADO_SN='N'";
			Connection con = conexao.abreConexao();
			Statement sta = con.createStatement();
			rt = sta.executeQuery(query);

		}
		return rt;
	}

	public String UpdateQtEnviada(int idArquivo, int Arq_QtEnvio_sms, int Arq_QtEnvio_email) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = conexao.abreConexao();

			ps = con.prepareStatement(
					"UPDATE dbo.ARQUIVOS_LIDOS SET ARQ_QTENVIO_SMS = ?, ARQ_QTENVIO_EMAIL = ? WHERE ARQ_ID = ?;");

			// set the preparedstatement parameters
			ps.setInt(1, Arq_QtEnvio_sms);
			ps.setInt(2, Arq_QtEnvio_email);
			ps.setInt(3, idArquivo);
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ps.close();
		}
		return "finalizou";
	}

}
