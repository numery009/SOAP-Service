package com.as.agentservice.service;

public class AgentServiceProxy implements com.as.agentservice.service.AgentService {
  private String _endpoint = null;
  private com.as.agentservice.service.AgentService agentService = null;
  
  public AgentServiceProxy() {
    _initAgentServiceProxy();
  }
  
  public AgentServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAgentServiceProxy();
  }
  
  private void _initAgentServiceProxy() {
    try {
      agentService = (new com.as.agentservice.service.AgentServiceServiceLocator()).getAgentService();
      if (agentService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)agentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)agentService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (agentService != null)
      ((javax.xml.rpc.Stub)agentService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.as.agentservice.service.AgentService getAgentService() {
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService;
  }
  
  public com.as.agentservice.vo.Agent getAgent(int i) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    return agentService.getAgent(i);
  }
  
  public void creatAgent(com.as.agentservice.vo.Agent agent) throws java.rmi.RemoteException{
    if (agentService == null)
      _initAgentServiceProxy();
    agentService.creatAgent(agent);
  }
  
  
}