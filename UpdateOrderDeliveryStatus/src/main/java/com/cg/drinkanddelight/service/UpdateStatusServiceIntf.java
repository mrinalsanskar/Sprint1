package com.cg.drinkanddelight.service;

import com.cg.drinkanddelight.exception.Exception404;

public interface UpdateStatusServiceIntf {
	void displayAllProductStatus() throws Exception404;
	void displayAllRawMaterialStatus() throws Exception404;	
}
