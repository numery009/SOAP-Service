package com.as.agentservice.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import weblogic.wsee.reliability2.sequence.CreateSequencePostSecurityTokenCallback;

import com.as.agentservice.vo.*;

public class AgentDAO {
	public void creatAgent(Agent agent) {

		Connection dbConn = null;
		PreparedStatement pStmt = null;
		int rowsInserted = 0;

		try {
			dbConn = getConnection();
			pStmt = dbConn
					.prepareStatement("INSERT INTO `tblagent` (agentAddress, agentName, city, state, zipCode) VALUES (?,?,?,?,?)");
			pStmt.setString(1, agent.getAgentAddress());
			pStmt.setString(2, agent.getAgentName());
			pStmt.setString(3, agent.getCity());
			pStmt.setString(4, agent.getState());
			pStmt.setString(1, agent.getZipCode());

			rowsInserted = pStmt.executeUpdate();

			if (rowsInserted != 1) {
				throw new Exception("Error in inserting the row");

			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			// throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			// throw e;
		} finally {
			try {
				pStmt.close();
				dbConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return;
	}

	public Agent getAgent(Agent agent) {

		Connection dbConn = null;
		PreparedStatement pStmt = null;
		int rowsInserted = 0;

		try {
			dbConn = getConnection();
			pStmt = dbConn
					.prepareStatement("select * from tblagent where agentId=?");
			pStmt.setInt(1, agent.getAgentId());			
			ResultSet rs = pStmt.executeQuery();
			
			   if (rs.next()) {		            
				   agent.setAgentId(rs.getInt(1));
				   agent.setAgentName(rs.getString(2));
				   agent.setAgentAddress(rs.getString(3));
				   agent.setCity(rs.getString(4));
				   agent.setState(rs.getString(5));
				   agent.setZipCode(rs.getString(6));
				   //return agent;
		        }

			if (rowsInserted != 1) {
				throw new Exception("Error in inserting the row");

			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			// throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			// throw e;
		} finally {
			try {
				pStmt.close();
				dbConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return agent;		
	}

	public static Connection getConnection() throws Exception {
		Connection dbConn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/test";
			Class.forName("com.mysql.jdbc.Driver");
			dbConn = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			throw sqle;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return dbConn;
	}
}
