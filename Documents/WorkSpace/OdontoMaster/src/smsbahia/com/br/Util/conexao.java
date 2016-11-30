package smsbahia.com.br.Util;
import java.sql.*;


public class conexao {
	
	
	
	
	private static String URL ="jdbc:jtds:sqlserver://localhost:1433/JobOdonto_Master;user=erivelton;password=M92s02s16;instance=DBSMS;";
			      private static String usuario = "erivelton";//esse usuário é um sysadmin ele tem todos os poderes, é bom que se crie um login e usuário a parte  
			      private static String password = "M92s02s16";  
			     private static String DRIVER ="net.sourceforge.jtds.jdbc.Driver" ;//Esse é o nome do driver, que na internet você vai encontrar de varias maneiras, mas só esse resolveu meus problemas  
			    
			    
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
