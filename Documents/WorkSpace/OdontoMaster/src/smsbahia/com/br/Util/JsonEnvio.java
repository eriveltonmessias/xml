package smsbahia.com.br.Util;

	import org.json.simple.JSONObject;
	import org.json.simple.parser.ParseException;

	
	public class JsonEnvio {
		
		private final String serial="5M53A1A";
		private final String Ws="01";
		private final String Token="iURfsmx-6JTEaRAYYAqTzztTwc_h4XKJdthxPMyz";
		private final String User="smsbahia";
		
		
		
		public String getSerial() {
			return serial;
		}



		public String getWs() {
			return Ws;
		}



		public String getToken() {
			return Token;
		}



		public String getUser() {
			return User;
		}



		@SuppressWarnings("unchecked")
		public String JsonEvioSMS(String numero, String mensagem) throws  ParseException{
			
			JSONObject json = new JSONObject();
			JsonEnvio je = new JsonEnvio();
			
			json.put("Serial", je.getSerial());
			json.put("Ws", je.getWs());
			json.put("User", je.getUser());
			json.put("Token", je.getToken());
			json.put("numero", numero.replaceAll(" ", ""));
			json.put("mensagem", mensagem.replaceAll(";", ""));
			return json.toString();
		
		}
		
	}
			
