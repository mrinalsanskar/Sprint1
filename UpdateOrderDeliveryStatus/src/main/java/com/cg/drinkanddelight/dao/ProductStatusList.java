package com.cg.drinkanddelight.dao;

import java.util.HashMap;

public class ProductStatusList {
	public HashMap<String, String> getData(){
		String str1="Accepted";
		String str2="Pending";
		HashMap<String, String> hm= new HashMap<>();
	    hm.put("PDT1011", str1);
	    hm.put("PDT1016", str2);
	    hm.put("PDT1919", str1);
	    hm.put("PDT1615", "Out For Delivery");
	    hm.put("PDT1909", str1);
	    hm.put("PDT1818", str1);
	    hm.put("PDT1617", str2);
	    hm.put("PDT1432", str2);
	    hm.put("PDT1611", "Out For Delivery");
	    hm.put("PDT1605", "Delivered");	    
	    return hm;	
	}
}
