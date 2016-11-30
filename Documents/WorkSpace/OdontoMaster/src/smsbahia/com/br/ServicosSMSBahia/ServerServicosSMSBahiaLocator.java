/**
 * ServerServicosSMSBahiaLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package smsbahia.com.br.ServicosSMSBahia;

public class ServerServicosSMSBahiaLocator extends org.apache.axis.client.Service implements smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahia {

    public ServerServicosSMSBahiaLocator() {
    }


    public ServerServicosSMSBahiaLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServerServicosSMSBahiaLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServerServicosSMSBahiaPort
    private java.lang.String ServerServicosSMSBahiaPort_address = "http://www.smsbahia.com.br/app/webservices/servico/webcorp.php";

    public java.lang.String getServerServicosSMSBahiaPortAddress() {
        return ServerServicosSMSBahiaPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServerServicosSMSBahiaPortWSDDServiceName = "server.ServicosSMSBahiaPort";

    public java.lang.String getServerServicosSMSBahiaPortWSDDServiceName() {
        return ServerServicosSMSBahiaPortWSDDServiceName;
    }

    public void setServerServicosSMSBahiaPortWSDDServiceName(java.lang.String name) {
        ServerServicosSMSBahiaPortWSDDServiceName = name;
    }

    public smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaPortType getServerServicosSMSBahiaPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServerServicosSMSBahiaPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServerServicosSMSBahiaPort(endpoint);
    }

    public smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaPortType getServerServicosSMSBahiaPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaBindingStub _stub = new smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaBindingStub(portAddress, this);
            _stub.setPortName(getServerServicosSMSBahiaPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServerServicosSMSBahiaPortEndpointAddress(java.lang.String address) {
        ServerServicosSMSBahiaPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaBindingStub _stub = new smsbahia.com.br.ServicosSMSBahia.ServerServicosSMSBahiaBindingStub(new java.net.URL(ServerServicosSMSBahiaPort_address), this);
                _stub.setPortName(getServerServicosSMSBahiaPortWSDDServiceName());
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
        if ("server.ServicosSMSBahiaPort".equals(inputPortName)) {
            return getServerServicosSMSBahiaPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:server.ServicosSMSBahia", "server.ServicosSMSBahia");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:server.ServicosSMSBahia", "server.ServicosSMSBahiaPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("ServerServicosSMSBahiaPort".equals(portName)) {
            setServerServicosSMSBahiaPortEndpointAddress(address);
        }
        else { // Unknown Port Name
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
