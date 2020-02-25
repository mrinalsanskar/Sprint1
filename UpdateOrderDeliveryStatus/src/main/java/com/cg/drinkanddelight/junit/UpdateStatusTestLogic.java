package com.cg.drinkanddelight.junit;

import java.util.HashMap;

import com.cg.drinkanddelight.dao.ProductStatusList;
import com.cg.drinkanddelight.model.ProductBeans;

public class UpdateStatusTestLogic {
	static String pdtId;
	static String pdtDs;
	static ProductStatusList ps=new ProductStatusList();
	static ProductBeans pb=new ProductBeans();
	static HashMap<String, String> hm1=ps.getData();
	public static Object doTest;
	
	public  String doTest(String pdtId, String pdt_Ds) {
		//UpdateStatusTestLogic exp=new UpdateStatusTestLogic();
		hm1.entrySet().stream().forEach(e -> {if(e.getKey()==pdtId) {hm1.replace(pb.getPdtId(),pb.getPdtDs());} else {System.out.println("invalid id");}});
		return null;
		
		
	}
}