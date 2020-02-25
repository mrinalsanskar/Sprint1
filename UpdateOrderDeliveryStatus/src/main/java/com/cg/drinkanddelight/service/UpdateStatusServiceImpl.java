package com.cg.drinkanddelight.service;

import com.cg.drinkanddelight.dao.ProductStatusImpl;
import com.cg.drinkanddelight.dao.RawMaterialStatusImpl;
import com.cg.drinkanddelight.exception.Exception404;

public class UpdateStatusServiceImpl implements UpdateStatusServiceIntf {
	
	ProductStatusImpl productStatusImp=new ProductStatusImpl();
	RawMaterialStatusImpl rawMaterialStatusImp=new RawMaterialStatusImpl();
	
	@Override
	public void displayAllProductStatus() throws Exception404 {
		productStatusImp.showProductDetails();
	}

	@Override
	public void displayAllRawMaterialStatus() throws Exception404 {
		rawMaterialStatusImp.showRawMaterialDetails();
	}
	
}
