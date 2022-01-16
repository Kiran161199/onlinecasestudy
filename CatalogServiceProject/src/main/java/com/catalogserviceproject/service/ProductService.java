package com.catalogserviceproject.service;

import java.sql.SQLException;
import java.util.List;

import com.catalogserviceproject.bean.Product;

public interface ProductService {
	List<Product> viewAllProduct()throws ClassNotFoundException,SQLException;
	public Product getProductItemsByCode(String code) throws ClassNotFoundException, SQLException;
}
