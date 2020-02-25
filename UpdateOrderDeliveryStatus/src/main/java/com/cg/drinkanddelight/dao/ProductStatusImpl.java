package com.cg.drinkanddelight.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.drinkanddelight.exception.Exception404;
import com.cg.drinkanddelight.model.ProductBeans;

public class ProductStatusImpl implements ProductInterfaces {

	public static HashMap<String, ProductBeans> hm= new HashMap<>();
	
	public ProductStatusImpl() {
		setProductStatusList();
	}
	private void setProductStatusList() {
		
		ProductBeans p1=new ProductBeans("PDT1011","Accepted","Hair Oil");
		ProductBeans p2=new ProductBeans("PDT1016","Pending","Pen");
		ProductBeans p3=new ProductBeans("PDT1017","out for Delivery","Hair Oil");
		ProductBeans p4=new ProductBeans("PDT1018","Accepted","Colgate");
		ProductBeans p5=new ProductBeans("PDT1019","Accepted","Laptop");
		ProductBeans p6=new ProductBeans("PDT1010","Accepted","Watch");
	
	    hm.put(p1.getPdtId(),p1);
	    hm.put(p2.getPdtId(), p2);
	    hm.put(p3.getPdtId(),p3);
	    hm.put(p4.getPdtId(), p4);
	    hm.put(p5.getPdtId(),p5);
	    hm.put(p6.getPdtId(), p6);
	   
		
	}

	@Override
	public HashMap<String, ProductBeans> getList() {
	     return hm;
	}
	@Override
	public void productUpdate(String productId, String status) throws Exception404 {
		ProductBeans p=null;
		
		if(!hm.isEmpty()) {
			for (Map.Entry<String, ProductBeans> entry : hm.entrySet()) {
			    if(entry.getValue().getPdtId().equals(productId)) {
			    	p=entry.getValue();
			    	break;
			    }
			}
		}
			
		if(p!=null) {
				
				hm.replace(p.getPdtId(),new ProductBeans(p.getPdtId(),status, p.getPdNmae()));
				
			}
		

		
	}
}
