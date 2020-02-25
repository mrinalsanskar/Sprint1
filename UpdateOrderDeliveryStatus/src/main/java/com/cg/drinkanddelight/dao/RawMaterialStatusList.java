package com.cg.drinkanddelight.dao;

import java.util.HashMap;

public class RawMaterialStatusList {
	String str1="Accepted";
	String str2="Pending";
	HashMap<String, String> hm= new HashMap<>();
		public HashMap<String, String> getData(){
		    hm.put("RM111", str1);
		    hm.put("RM116", str2);
		    hm.put("RM199", str1);
		    hm.put("RM165", "Out For Delivery");
		    hm.put("RM190", str1);
		    hm.put("RM188", str1);
		    hm.put("RM167", str2);
		    hm.put("RM143", str2);
		    hm.put("RM615", "Out For Delivery");
		    hm.put("RM160", "Delivered");	    
		   return hm;
		}
}
