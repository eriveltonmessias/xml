package smsbahia.com.br.Util;
import java.sql.*;


public class conexao {
	
	
	
	
	private static String URL ="jdbc:jtds:sqlserver://localhost:1433/JobOdonto_Master;user=erivelton;password=M92s02s16;instance=DBSMS;";
			      private static String usuario = "erivelton";//esse usu�rio � um sysadmin ele tem todos os poderes, � bom que se crie um login e usu�rio a parte  
			      private static String password = "M92s02s16";  
			     private static String DRIVER ="net.sourceforge.jtds.jdbc.Driver" ;//Esse � o nome do driver, que na internet voc� vai encontrar de varias maneiras, mas s� esse resolveu meus problemas  
			    
			    
			     public static Connection abreConexao() throws SQLException{  
			        try {  
			    
			          Class.forName(DRIVER);  
			          Connection con = DriverManager.getConnection(URL,usuario,password);  
			          return con;  
			    
			        } catch (ClassNotFoundException e) {  
			          
			        	throw new SQLException(e.getMessage());
			    
			        }  
			     }  
	

	
	    
}
