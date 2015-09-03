/**
 * AgentServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.as.agentservice.service;

public interface AgentServiceService extends javax.xml.rpc.Service {
    public java.lang.String getAgentServiceAddress();

    public com.as.agentservice.service.AgentService getAgentService() throws javax.xml.rpc.ServiceException;

    public com.as.agentservice.service.AgentService getAgentService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
