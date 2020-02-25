package com.cg.drinkanddelight.dao;

import java.util.HashMap;

import com.cg.drinkanddelight.exception.Exception404;
import com.cg.drinkanddelight.model.ProductBeans;

public interface ProductInterfaces {
	void productUpdate(String productId,String status) throws Exception404;
	
	public HashMap<String,ProductBeans> getList();
}
