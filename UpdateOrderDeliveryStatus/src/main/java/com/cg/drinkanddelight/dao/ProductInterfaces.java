package com.cg.drinkanddelight.dao;

import com.cg.drinkanddelight.exception.Exception404;

public interface ProductInterfaces {
	void productStatus() throws Exception404;
	void showProductDetails() throws Exception404;
}
