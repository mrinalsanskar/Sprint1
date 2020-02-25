package com.cg.drinkanddelight.model;

public class ProductBeans {
	String pdtId;
	String pdtDs;
	String pdNmae;
	
	
	public ProductBeans(String pdtId, String pdtDs, String pdNmae) {
		
		this.pdtId = pdtId;
		this.pdtDs = pdtDs;
		this.pdNmae = pdNmae;
	}
	
	public String getPdtId() {
		return pdtId;
	}
	public void setPdtId(String pdtId) {
		this.pdtId = pdtId;
	}
	public String getPdtDs() {
		return pdtDs;
	}
	public void setPdtDs(String pdtDs) {
		this.pdtDs = pdtDs;
	}

	public String getPdNmae() {
		return pdNmae;
	}

	public void setPdNmae(String pdNmae) {
		this.pdNmae = pdNmae;
	}	
	
}
