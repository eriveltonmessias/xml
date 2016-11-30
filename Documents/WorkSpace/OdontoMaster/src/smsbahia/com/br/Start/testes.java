package smsbahia.com.br.Start;

import java.io.IOException;
import java.net.URL;
import java.rmi.Remote;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import smsbahia.com.br.ServicosSMSBahia.*;

public class testes {

	/*public String sendPost() throws MinhaException {

		String url="http://www.smsbahia.com.br/app/webservices/cliente/webcorp.php?metodo=enviarTorpedo&usuario=smsbahia&senha=ba094ucs&idMensagem=135356&destinatario=5571981416558&mensagem=ViaGET";
	    try {
	        // Cria um objeto HttpURLConnection:
	        HttpURLConnection request = (HttpURLConnection) new URL(url).openConnection();

	        try {
	            // Define que a conexão pode enviar informações e obtê-las de volta:
	            request.setDoOutput(true);
	            request.setDoInput(true);

	            // Define o content-type:
	           
	            request.addRequestProperty("User-Agent", 
	            		"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)"); 
	         

	            // Define o método da requisição:
	            request.setRequestMethod("GET");

	            // Conecta na URL:
	            request.connect();

	            // Escreve o objeto JSON usando o OutputStream da requisição:
	          

	            // Caso você queira usar o código HTTP para fazer alguma coisa, descomente esta linha.
	            //int response = request.getResponseCode();
	            
	            return readResponse(request);
	            
	        } finally {
	            request.disconnect();
	        }
	    } catch (IOException ex) {
	        throw new MinhaException(ex);
	    }
	}

	
	public String readResponse(HttpURLConnection request) throws IOException {
	    ByteArrayOutputStream os;
	    try (InputStream is = request.getInputStream()) {
	        os = new ByteArrayOutputStream();
	        int b;
	        while ((b = is.read()) != -1) {
	            os.write(b);
	        }
	    }
	    return new String(os.toByteArray());
	}

	public static class MinhaException extends Exception {
	    private static final long serialVersionUID = 1L;

	    public MinhaException(Throwable cause) {
	        super(cause);
	    }
	}	
	*/
	
	
	
	public static void main(String[] args) throws  IOException {
		
		ServerServicosSMSBahiaProxy proxy = new ServerServicosSMSBahiaProxy();
		
		String resposta = proxy.enviarTorpedo("smsbahia", "ba094ucs", "5571981416558", "123456", "testeSoap", "2016-11-18 11:57:46");
		System.out.println(resposta);
		
		String ok = "OK";
		if(resposta.equals(ok)){
			System.out.println("AQUI1");
		}else {
			System.out.println("AQUI2");
		}
		
	    }
		
	
	    }
		
		

	    
	    


