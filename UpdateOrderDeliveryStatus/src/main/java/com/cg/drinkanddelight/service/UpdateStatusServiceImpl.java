package com.cg.drinkanddelight.service;

import java.util.HashMap;

import com.cg.drinkanddelight.dao.ProductStatusImpl;
import com.cg.drinkanddelight.dao.RawMaterialStatusImpl;
import com.cg.drinkanddelight.exception.Exception404;
import com.cg.drinkanddelight.model.ProductBeans;
import com.cg.drinkanddelight.model.RawMaterialBeans;

public class UpdateStatusServiceImpl implements UpdateStatusServiceIntf {
	
	ProductStatusImpl productStatusImp=new ProductStatusImpl();
	RawMaterialStatusImpl rawMaterialStatusImp=new RawMaterialStatusImpl();
	
	@Override
	public HashMap<String,ProductBeans> displayAllProductStatus() throws Exception404 {
		return productStatusImp.getList();
		
	}

	@Override
	public HashMap<String, RawMaterialBeans> displayAllRawMaterialStatus() throws Exception404 {
		return rawMaterialStatusImp.getList();
	}

	@Override
	public void productStatusUpdate(String productId, String status) {
		try {
		
			productStatusImp.productUpdate(productId, status);
			
			
		} catch (Exception404 e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void rawMaterialUpdate(String rmId, String status) {
		try {
			
			rawMaterialStatusImp.rawMaterialStatusUpdate(rmId, status);
			
			
		} catch (Exception404 e) {
			
			e.printStackTrace();
		}
	}
}
