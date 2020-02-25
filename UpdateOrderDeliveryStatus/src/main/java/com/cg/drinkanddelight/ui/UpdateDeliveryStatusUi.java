package com.cg.drinkanddelight.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.cg.drinkanddelight.dao.ProductStatusImpl;
import com.cg.drinkanddelight.dao.ProductStatusList;
import com.cg.drinkanddelight.dao.RawMaterialStatusImpl;
import com.cg.drinkanddelight.dao.RawMaterialStatusList;
import com.cg.drinkanddelight.exception.Exception404;
import com.cg.drinkanddelight.service.UpdateStatusServiceImpl;

public class UpdateDeliveryStatusUi {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader buff=new BufferedReader(isr);
	
	RawMaterialStatusImpl r=new RawMaterialStatusImpl();
	ProductStatusImpl p=new ProductStatusImpl();
	
	String opr;
	int choice;
	String choice2;
	
	UpdateStatusServiceImpl obj=new UpdateStatusServiceImpl();
	
	
	ProductStatusList ps=new ProductStatusList();
	RawMaterialStatusList rms=new RawMaterialStatusList();
	HashMap<String, String> hm2=ps.getData();
	HashMap<String, String> hm3=rms.getData();

	public static void main(String[] args) {
		UpdateDeliveryStatusUi exec=new UpdateDeliveryStatusUi();
		exec.isr=new InputStreamReader(System.in);
        exec.buff=new BufferedReader(exec.isr);
        exec.ui();
	}
	
	public void ui() {
		try {
			obj.displayAllProductStatus();
		} catch (Exception404 e1) {
			System.out.println("An Exception Occured!!!!");
		}
		System.out.println("\n");
		try {
			obj.displayAllRawMaterialStatus();
		} catch (Exception404 e1) {
			System.out.println("An Exception Occured!!!!");
		}
		System.out.println("\n");
			    do {
				System.out.println("******LET'S UPDATE THE ORDER DELIVERY STATUS******");
				System.out.println("Select the category:\n 1. RAW MATERIALS\n 2. PRODUCTS\n 3. SHOW ALL UPDATE STATUS");
				String str="Invalid Choice";
				try {
				choice=Integer.parseInt(buff.readLine());
				}
				catch(IOException e) {
					System.out.println(e);
				}
				switch(choice) {
					case 1: r.rawMaterialStatus();
					        break;
					case 2: p.productStatus();
					        break;
					case 3: System.out.println("1. OF RAW MATERIALS\n 2. OF PRODUCTS");
					       int choice1=0;
					       try {
						         choice1=Integer.parseInt(buff.readLine());
						    }
						   catch(IOException e) {
							        System.out.println(e);
						     }
					       switch(choice1) {
					       case 1: r.showRawMaterialDetails();
					               break;
					       case 2: p.showProductDetails();
					               break;
					       default: System.out.println(str); 
					       }
					       break;
					default: System.out.println(str);
				}
				System.out.println("Do you want to continue?(y/n)");
				try {
				   opr=buff.readLine();
				}
				catch(IOException e) {
			        System.out.println(e);
		     }
				}while(opr.equalsIgnoreCase("y"));
	}
}
