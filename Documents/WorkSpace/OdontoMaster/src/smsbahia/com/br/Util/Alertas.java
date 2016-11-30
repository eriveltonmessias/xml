package smsbahia.com.br.Util;

import smsbahia.com.br.Util.Consumidor.MinhaException;

public class Alertas {
	
	
	public void AlertasMsg() throws MinhaException{
		
		String Json="{\"Serial\": \"5M53A1A\","
				+ "\"Ws\": \"04\","
				+ "\"User\": \"smsbahia\","
				+ "\"Token\": \"iURfsmx-6JTEaRAYYAqTzztTwc_h4XKJdthxPMyz\", "
				+ "\"Json\": {\"messages\": ["
				+ "{\"destination\":\"5571981416558\"},"
				+ "{\"destination\":\"5571992374904\"}, "
				+ "{\"destination\":\"5571991941207\"}],"
				+ "\"defaultValues\": { \"messageText\": \"ALERTA: Ocorreu uma exececao no Job do Qware!\""
				+"}}}";
	
		
		Consumidor consumidor =  new Consumidor();
		consumidor.sendPost(Json);

	}

}
