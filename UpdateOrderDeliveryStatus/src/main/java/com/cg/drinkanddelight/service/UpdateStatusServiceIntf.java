package com.cg.drinkanddelight.service;

import java.util.HashMap;

import com.cg.drinkanddelight.exception.Exception404;
import com.cg.drinkanddelight.model.ProductBeans;
import com.cg.drinkanddelight.model.RawMaterialBeans;

public interface UpdateStatusServiceIntf {
	public HashMap<String,ProductBeans> displayAllProductStatus() throws Exception404;
	public HashMap<String,RawMaterialBeans> displayAllRawMaterialStatus() throws Exception404;	
	void productStatusUpdate(String productId,String status) throws Exception404;
	void rawMaterialUpdate(String rmId, String status) throws Exception404;
}
