package com.cg.drinkanddelight.model;

public class RawMaterialBeans {
	String rmId;
	String rmDs;
	String rmName;
	public RawMaterialBeans(String rmId, String rmDs, String rmName) {
		
		this.rmId = rmId;
		this.rmDs = rmDs;
		this.rmName = rmName;
	}
	public String getRmId() {
		return rmId;
	}
	public void setRmId(String rmId) {
		this.rmId = rmId;
	}
	public String getRmDs() {
		return rmDs;
	}
	public void setRmDs(String rmDs) {
		this.rmDs = rmDs;
	}
	public String getRmName() {
		return rmName;
	}
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	
}
