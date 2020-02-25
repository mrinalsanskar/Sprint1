package com.cg.drinkanddelight.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.cg.drinkanddelight.model.*;

public class ProductStatusImpl implements ProductInterfaces {
	ProductBeans pb=new ProductBeans();
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader buff=new BufferedReader(isr);
	
	ProductStatusList ps=new ProductStatusList();
	HashMap<String, String> hm1=ps.getData();
	
	public void productStatus(){ 
	  try {
		System.out.println("Enter the Product Order ID:");
		pb.setPdtId(buff.readLine());
		System.out.println("Enter the Product Delivery Status:");
		pb.setPdtDs(buff.readLine());
		hm1.replace(pb.getPdtId(),pb.getPdtDs());
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void showProductDetails() {
		System.out.println("****Product Delivery Status*****");
		hm1.entrySet().stream().forEach(e -> System.out.println("Product ID:"+ e.getKey()+" Delivery Status:"+e.getValue()));
	}
}
