package com.as.agentservice.service;

import java.rmi.RemoteException;

import com.as.agentservice.vo.Agent;

public class AgentServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgentServiceProxy proxy =new AgentServiceProxy();
		try {
			Agent agent= proxy.getAgent(1);
			System.out.println(agent.getAgentId()+"\n");
			System.out.println(agent.getAgentName()+"\n");
			System.out.println(agent.getAgentAddress()+"\n");
			System.out.println(agent.getCity()+"\n");
			System.out.println(agent.getState()+"\n");
			System.out.println(agent.getZipCode()+"\n");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
