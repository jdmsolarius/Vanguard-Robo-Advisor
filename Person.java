package robo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Person implements Serializable{

	/**
	 * 
	 */
	//private static final long serialVersionUID = -4029338873222937938L;
	private String name;
	private String email;
	private int riskProfile;
	private riskProfiles riskLevel = null;
	private Double netWorth;
	private HashMap<String, Integer> shares = new HashMap<String, Integer>();

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRiskProfile() {
		return riskProfile;
	}

	public void setRiskProfile(int riskProfile) {
		this.riskProfile = riskProfile;
	}

	public riskProfiles getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(riskProfiles riskLevel) {
		this.riskLevel = riskLevel;
	}

	public Double getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(Double netWorth) {
		this.netWorth = netWorth;
	}

	public HashMap<String, Integer> getShares() {
		return shares;
	}

	public void setShares(HashMap<String, Integer> shares) {
		this.shares = shares;
	}
}

