/**
 * AgentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.as.agentservice.service;

public interface AgentService extends java.rmi.Remote {
    public com.as.agentservice.vo.Agent getAgent(int i) throws java.rmi.RemoteException;
    public void creatAgent(com.as.agentservice.vo.Agent agent) throws java.rmi.RemoteException;
}
