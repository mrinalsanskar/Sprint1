package com.cg.drinkanddelight.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.cg.drinkanddelight.model.*;

public class RawMaterialStatusImpl implements RawMaterialInterfaces {
	RawMaterialBeans rb=new RawMaterialBeans();
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader buff=new BufferedReader(isr);
	
	RawMaterialStatusList rms=new RawMaterialStatusList();
	HashMap<String, String> hm1=rms.getData();
	
	public void rawMaterialStatus(){
		try {
		System.out.println("Enter the Raw Material Order ID:");
		rb.setRmId(buff.readLine());
		System.out.println("Enter the Raw Material Delivery Status:");
		rb.setRmDs(buff.readLine());
		hm1.replace(rb.getRmId(),rb.getRmDs());
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void showRawMaterialDetails() {
		System.out.println("*****Raw Material Delivery Status****");
		hm1.entrySet().stream().forEach(e -> System.out.println("Raw Material ID:"+ e.getKey()+ " Delivery Status:"+e.getValue()));
	}
}
