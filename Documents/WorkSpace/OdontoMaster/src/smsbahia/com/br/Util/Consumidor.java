/**
 * @author Erivelton Messias
 * 
 * Classe onde envia a requisi��o do sms e recebe a resposta do webservice
 * 
 * **/

package smsbahia.com.br.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Consumidor {
	

	public String sendPost(String json) throws MinhaException {

		String url="http://maxx.mobi/api/sms/EnviosRetornos";
	    try {
	        // Cria um objeto HttpURLConnection:
	        HttpURLConnection request = (HttpURLConnection) new URL(url).openConnection();

	        try {
	            // Define que a conex�o pode enviar informa��es e obt�-las de volta:
	            request.setDoOutput(true);
	            request.setDoInput(true);

	            // Define o content-type:
	            request.setRequestProperty("Content-Type", "application/json");

	            // Define o m�todo da requisi��o:
	            request.setRequestMethod("POST");

	            // Conecta na URL:
	            request.connect();

	            // Escreve o objeto JSON usando o OutputStream da requisi��o:
	            try (OutputStream outputStream = request.getOutputStream()) {
	                outputStream.write(json.getBytes("UTF-8"));
	            }

	            // Caso voc� queira usar o c�digo HTTP para fazer alguma coisa, descomente esta linha.
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
	

}
