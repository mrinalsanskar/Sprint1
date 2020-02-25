package com.cg.drinkanddelight.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.drinkanddelight.exception.Exception404;
import com.cg.drinkanddelight.model.*;

public class RawMaterialStatusImpl implements RawMaterialInterfaces {
	
		HashMap<String, RawMaterialBeans> hmRaw= new HashMap<>();
	
		public RawMaterialStatusImpl() {
			setRawMaterialStatusList();
		}
		
		private void setRawMaterialStatusList() {
			
			RawMaterialBeans r1=new RawMaterialBeans("RM1111","Accepted","Soda");
			RawMaterialBeans r2=new RawMaterialBeans("RM5016","Pending","Mojito");
			RawMaterialBeans r3=new RawMaterialBeans("RM1517","out for Delivery","Namkeen");
			RawMaterialBeans r4=new RawMaterialBeans("RM1318","Accepted","Glasses");
			RawMaterialBeans r5=new RawMaterialBeans("RM1219","Accepted","Mixer");
			RawMaterialBeans r6=new RawMaterialBeans("RM1110","Accepted","Chairs");
		
		    hmRaw.put(r1.getRmId(),r1);
		    hmRaw.put(r2.getRmId(), r2);
		    hmRaw.put(r3.getRmId(),r3);
		    hmRaw.put(r4.getRmId(), r4);
		    hmRaw.put(r5.getRmId(),r5);
		    hmRaw.put(r6.getRmId(), r6);
	   }
		
		@Override
		public HashMap<String, RawMaterialBeans> getList() {
			return hmRaw;
		}
		
		
		@Override
		public void rawMaterialStatusUpdate(String rmId, String status) throws Exception404 {
             RawMaterialBeans r=null;
             if(!hmRaw.isEmpty()) {
				for (Map.Entry<String, RawMaterialBeans> entry : hmRaw.entrySet()) {
				    if(entry.getValue().getRmId().equals(rmId)) {
				    	r=entry.getValue();
				    	break;
				    }
				}
			}
				
			
			if(r!=null) {
					hmRaw.replace(r.getRmId(),new RawMaterialBeans(r.getRmId(),status, r.getRmName()));
				}
			
		}
		

	}
