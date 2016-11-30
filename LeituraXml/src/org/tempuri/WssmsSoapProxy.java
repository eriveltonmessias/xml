package org.tempuri;

public class WssmsSoapProxy implements org.tempuri.WssmsSoap {
  private String _endpoint = null;
  private org.tempuri.WssmsSoap wssmsSoap = null;
  
  public WssmsSoapProxy() {
    _initWssmsSoapProxy();
  }
  
  public WssmsSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWssmsSoapProxy();
  }
  
  private void _initWssmsSoapProxy() {
    try {
      wssmsSoap = (new org.tempuri.WssmsLocator()).getwssmsSoap();
      if (wssmsSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wssmsSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wssmsSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wssmsSoap != null)
      ((javax.xml.rpc.Stub)wssmsSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WssmsSoap getWssmsSoap() {
    if (wssmsSoap == null)
      _initWssmsSoapProxy();
    return wssmsSoap;
  }
  
  public java.lang.String envios(int tipo, java.lang.String user, java.lang.String token, java.lang.String json) throws java.rmi.RemoteException{
    if (wssmsSoap == null)
      _initWssmsSoapProxy();
    return wssmsSoap.envios(tipo, user, token, json);
  }
  
  public java.lang.String retornos(java.lang.String serial, java.lang.String conta, java.lang.String sub_conta, java.lang.String periodo_inicial, java.lang.String periodo_final) throws java.rmi.RemoteException{
    if (wssmsSoap == null)
      _initWssmsSoapProxy();
    return wssmsSoap.retornos(serial, conta, sub_conta, periodo_inicial, periodo_final);
  }
  
  public java.lang.String status(java.lang.String user, java.lang.String token, java.lang.String id) throws java.rmi.RemoteException{
    if (wssmsSoap == null)
      _initWssmsSoapProxy();
    return wssmsSoap.status(user, token, id);
  }
  
  
}