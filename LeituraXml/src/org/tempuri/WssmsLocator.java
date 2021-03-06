/**
 * WssmsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WssmsLocator extends org.apache.axis.client.Service implements org.tempuri.Wssms {

    public WssmsLocator() {
    }


    public WssmsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WssmsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for wssmsSoap
    private java.lang.String wssmsSoap_address = "https://maxx.mobi/wssms.asmx";

    public java.lang.String getwssmsSoapAddress() {
        return wssmsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wssmsSoapWSDDServiceName = "wssmsSoap";

    public java.lang.String getwssmsSoapWSDDServiceName() {
        return wssmsSoapWSDDServiceName;
    }

    public void setwssmsSoapWSDDServiceName(java.lang.String name) {
        wssmsSoapWSDDServiceName = name;
    }

    public org.tempuri.WssmsSoap getwssmsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wssmsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwssmsSoap(endpoint);
    }

    public org.tempuri.WssmsSoap getwssmsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WssmsSoapStub _stub = new org.tempuri.WssmsSoapStub(portAddress, this);
            _stub.setPortName(getwssmsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwssmsSoapEndpointAddress(java.lang.String address) {
        wssmsSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WssmsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WssmsSoapStub _stub = new org.tempuri.WssmsSoapStub(new java.net.URL(wssmsSoap_address), this);
                _stub.setPortName(getwssmsSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("wssmsSoap".equals(inputPortName)) {
            return getwssmsSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "wssms");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "wssmsSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wssmsSoap".equals(portName)) {
            setwssmsSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
