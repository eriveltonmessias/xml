package util;

import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.tempuri.*;

public class start {

	public static void main(String[] args) throws RemoteException {
		
	try {
		WssmsSoapStub soap = new WssmsSoapStub();
		String resposta = soap.envios(01, "smsbahia", "[SENHA]", "{}");
		
		System.out.println(resposta);
		
	} catch (AxisFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

	}

}
