package com.as.agentservice.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.as.agentservice.dao.AgentDAO;
import com.as.agentservice.vo.Agent;

@WebService(serviceName="agentservice")
public class AgentService {

	@WebMethod
	public void creatAgent(Agent agent) {
		AgentDAO agentDao =new AgentDAO();
		agentDao.creatAgent(agent);
	}
	@WebMethod
	public Agent getAgent(int i) {
		Agent agent =new Agent();
		agent.setAgentId(i);
		AgentDAO agentDao =new AgentDAO();		
		agent= agentDao.getAgent(agent);
	 	return agent;
	}
}
