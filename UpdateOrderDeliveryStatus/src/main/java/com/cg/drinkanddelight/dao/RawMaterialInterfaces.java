package com.cg.drinkanddelight.dao;

import java.util.HashMap;

import com.cg.drinkanddelight.exception.Exception404;
import com.cg.drinkanddelight.model.RawMaterialBeans;

public interface RawMaterialInterfaces {
	void rawMaterialStatusUpdate(String rmId,String status) throws Exception404;
	public HashMap<String,RawMaterialBeans> getList();
}
