/**
 * WssmsSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface WssmsSoap extends java.rmi.Remote {
    public java.lang.String envios(int tipo, java.lang.String user, java.lang.String token, java.lang.String json) throws java.rmi.RemoteException;
    public java.lang.String retornos(java.lang.String serial, java.lang.String conta, java.lang.String sub_conta, java.lang.String periodo_inicial, java.lang.String periodo_final) throws java.rmi.RemoteException;
    public java.lang.String status(java.lang.String user, java.lang.String token, java.lang.String id) throws java.rmi.RemoteException;
}
