/**
 * AgentServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.as.agentservice.service;

public class AgentServiceServiceLocator extends org.apache.axis.client.Service implements com.as.agentservice.service.AgentServiceService {

    public AgentServiceServiceLocator() {
    }


    public AgentServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgentServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgentService
    private java.lang.String AgentService_address = "http://localhost:7001/AgentServiceSoap/services/AgentService";

    public java.lang.String getAgentServiceAddress() {
        return AgentService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgentServiceWSDDServiceName = "AgentService";

    public java.lang.String getAgentServiceWSDDServiceName() {
        return AgentServiceWSDDServiceName;
    }

    public void setAgentServiceWSDDServiceName(java.lang.String name) {
        AgentServiceWSDDServiceName = name;
    }

    public com.as.agentservice.service.AgentService getAgentService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AgentService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAgentService(endpoint);
    }

    public com.as.agentservice.service.AgentService getAgentService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.as.agentservice.service.AgentServiceSoapBindingStub _stub = new com.as.agentservice.service.AgentServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAgentServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgentServiceEndpointAddress(java.lang.String address) {
        AgentService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.as.agentservice.service.AgentService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.as.agentservice.service.AgentServiceSoapBindingStub _stub = new com.as.agentservice.service.AgentServiceSoapBindingStub(new java.net.URL(AgentService_address), this);
                _stub.setPortName(getAgentServiceWSDDServiceName());
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
        if ("AgentService".equals(inputPortName)) {
            return getAgentService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.agentservice.as.com", "AgentServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.agentservice.as.com", "AgentService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgentService".equals(portName)) {
            setAgentServiceEndpointAddress(address);
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
