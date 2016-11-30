package smsbahia.com.br.Start;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;


import smsbahia.com.br.Dao.BeanAutenticacao;
import smsbahia.com.br.Dao.BeanDao;
import smsbahia.com.br.Dao.BeanUpdate;
import smsbahia.com.br.Dao.PersistenciaDao;
import smsbahia.com.br.Util.*;
import smsbahia.com.br.Util.Consumidor.MinhaException;
import smsbahia.com.br.ServicosSMSBahia.*;

public class principal {




	

	public static void main(String[] args) throws SQLException, MinhaException {
		
		try{ Timer timer = new Timer();
         Agendador agendador = new Agendador();
         timer.schedule(agendador, 0, 10000);
         
         while(true){
             
             try {
                    Thread.sleep(20000);
		
		int idGlobalArquivo=0;
		LeituraXml lerxml = new LeituraXml();
		PersistenciaDao psDao = new PersistenciaDao();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
	

		
		String path="C:\\Users\\Suporte_ti\\Desktop\\xml2\\";
		
	    File file = new File(path);
	    File[] arquivos = file.listFiles();
	    

	    System.out.println("\nComeçando a procurar arquivos... "+sdf.format(new Date()));
	    for (File arquivo : arquivos) {
	       
	   
		String StringCaminho = arquivo.toString();
	        
		//Faz o select com o nome do arquivo para verificar se existe
		int testeArquivo = psDao.SelectArquivo(StringCaminho);
	
		//Verifica se o arquivo já existe, se não existir insere e já traz sua chave para usar no update do envio
		if (testeArquivo == 0){
			try {
				psDao.InserirArquivo(StringCaminho);
				idGlobalArquivo = psDao.SelectArquivo(StringCaminho); 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		
	    
		System.out.println("Inserindo os Dados do Arquivo no Banco... "+sdf.format(new Date()));
		// Capturando o telefone e a mensagem do arquivo e iserindo no banco de dados
			
		try {
			ArrayList<BeanDao> linhasDoArquivo = lerxml.Leitura(arquivo.toString());
			psDao.InserirDados(linhasDoArquivo);
			
			System.out.println("Fim da inserção... "+sdf.format(new Date()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    
		
		// Disparo dos SMSs
		ResultSet rs;
		BeanAutenticacao autenc = new BeanAutenticacao();
		ServerServicosSMSBahiaProxy proxy = new ServerServicosSMSBahiaProxy();
		String jsonResposta;
		int qtEnviada = 0;
		
		rs=  psDao.SelectDados(1);
		
		System.out.println("Iniciando Disparo de SMS... "+sdf.format(new Date()));
		ArrayList<BeanUpdate> list2 = new ArrayList<>();
		while(rs.next()){
			BeanUpdate beanup = new BeanUpdate();
			
		try {
			jsonResposta = proxy.enviarTorpedo(autenc.getUsuario(), autenc.getSenha(), rs.getString("SMS_NUMERO"), Integer.toString(rs.getInt("SMS_ID")), 
					rs.getString("SMS_MENSAGEM"), autenc.getAgendamento());
			
			
			beanup.setSms_id(rs.getInt("SMS_ID"));
			beanup.setId_sms(jsonResposta);
			beanup.setArq_id(idGlobalArquivo);
			list2.add(beanup);
			
			qtEnviada=qtEnviada+1;
			
		}finally {
			
			
			
			//criar um log com a data e hota fa finalizacao
		}
		}
		System.out.println("Finalizando Disparos... "+sdf.format(new Date()));
		psDao.updateDados(list2);
		System.out.println("\nFim dos disparos de SMS e do processo por inteiro! \nTotal de disparos:"+qtEnviada+"\n"+sdf.format(new Date()));
		psDao.UpdateQtEnviada(idGlobalArquivo, qtEnviada,1);
		System.out.println("---------------------------------------------");
		}else {
			System.out.println("\nO arquivo "+arquivo.toString()+"\njá foi processado, verifique o arquivo e compare a quantidade enviada.");
		
		}
		
		System.out.println("Movendo arquivo");
	    try {
			Filecopy.copyFile(StringCaminho);
			System.out.println("Arquivo foi movido...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
		}//Aqui Dentro
		

		
	
	
	    } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
     }

}
         }catch (Exception e) {
			//Alertas alerta = new Alertas();
			//alerta.AlertasMsg();
			System.out.println("-------------------------------------------------------");
			e.printStackTrace();
			System.out.println("-------------------------------------------------------");
		}
	}
	
}
