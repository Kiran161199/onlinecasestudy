package com.catalogserviceproject.service;

import java.sql.SQLException;
import java.util.List;

import com.catalogserviceproject.bean.Product;

public interface ProductService {
	List<Product> getAllProduct()throws ClassNotFoundException,SQLException;
	public Product getProductItemsById(String id) throws ClassNotFoundException, SQLException;
}
