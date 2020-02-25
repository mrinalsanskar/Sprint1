package com.cg.drinkanddelight.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import com.cg.drinkanddelight.dao.ProductStatusImpl;
import com.cg.drinkanddelight.dao.RawMaterialStatusImpl;
import com.cg.drinkanddelight.exception.Exception404;
import com.cg.drinkanddelight.model.ProductBeans;
import com.cg.drinkanddelight.model.RawMaterialBeans;
import com.cg.drinkanddelight.service.UpdateStatusServiceImpl;

public class UpdateDeliveryStatusUi {
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader buff=new BufferedReader(isr);
	
	RawMaterialStatusImpl r=new RawMaterialStatusImpl();
	ProductStatusImpl p=new ProductStatusImpl();
	
	String opr;
	String choice;
	String choice1;
	String choice2;
	
	UpdateStatusServiceImpl obj;

	public static void main(String[] args) {
		UpdateDeliveryStatusUi exec=new UpdateDeliveryStatusUi();
		exec.isr=new InputStreamReader(System.in);
        exec.buff=new BufferedReader(exec.isr);
        exec.obj=new UpdateStatusServiceImpl();
        exec.ui();
	}
	
	public void ui() {
		try {
			
			showProductDetails(obj.displayAllProductStatus());
			
		} catch (Exception404 e1) {
			System.out.println("An Exception Occured!!!!");
		}
		System.out.println("\n");
		try {
			showRawMaterialDetails(obj.displayAllRawMaterialStatus());
		} catch (Exception404 e1) {
			System.out.println("An Exception Occured!!!!");
		}
		System.out.println("\n");
			    do {
				System.out.println("******LET'S UPDATE THE ORDER DELIVERY STATUS******");
				System.out.println("Select the category:\n 1. RAW MATERIALS\n 2. PRODUCTS\n 3. SHOW ALL UPDATE STATUS\n 4. Exit");
				String str="Invalid Choice";
				try {
				choice=buff.readLine();
				}
				catch(IOException e) {
					System.out.println(e);
				}
				switch(choice) {
					case "1": updateRawMaterialStatus();
					        break;
					case "2": 
							updateProductStatus();
					        break;
					case "3": System.out.println("1. OF RAW MATERIALS\n 2. OF PRODUCTS");
					       try {
						         choice1=buff.readLine();
						    }
						   catch(IOException e) {
							        System.out.println(e);
						     }
					       switch(choice1) {
					       case "1": try {
								showRawMaterialDetails(obj.displayAllRawMaterialStatus());
							} catch (Exception404 e1) {
								
								System.out.println(e1);
							}
					               break;
					       case "2": try {
								showProductDetails(obj.displayAllProductStatus());
							} catch (Exception404 e1) {
								
								System.out.println(e1);
							}
					               break;
					       default: System.out.println(str); 
					       }
					       break;
			     case "4": System.exit(0);
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

	public void showProductDetails(HashMap<String,ProductBeans> hm) {
		System.out.println("****Product Delivery Status*****");
		hm.entrySet().stream().forEach(e -> System.out.println("Product Name:"+e.getValue().getPdNmae()+" Product ID:"+ e.getValue().getPdtId()+" Delivery Status:"+e.getValue().getPdtDs()));
	}
	
	private void showRawMaterialDetails(HashMap<String, RawMaterialBeans> hm1) {
		System.out.println("****Raw Material Delivery Status*****");
		hm1.entrySet().stream().forEach(e -> System.out.println("Raw Material Name:"+e.getValue().getRmName()+" Raw Material ID:"+ e.getValue().getRmId()+" Delivery Status:"+e.getValue().getRmDs()));
		
	}

	private void updateProductStatus() {
		
		try {
			System.out.println("Enter the Product Order ID:");
			 String productId=buff.readLine();
			System.out.println("Enter the Product Delivery Status:");
			String status=buff.readLine();
			obj.productStatusUpdate(productId, status);
			}
			catch(IOException e) {
				System.out.println(e);
			}
	}
	
private void updateRawMaterialStatus() {
		
		try {
			System.out.println("Enter the Raw Material Order ID:");
			 String rmId=buff.readLine();
			System.out.println("Enter the Raw Material Delivery Status:");
			String status=buff.readLine();
			obj.rawMaterialUpdate(rmId, status);
			}
			catch(IOException e) {
				System.out.println(e);
			}
	}
}
