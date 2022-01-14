package com.catalogserviceproject.persistance;

import java.sql.SQLException;
import java.util.List;


import com.catalogserviceproject.bean.Product;

public interface ProductDao {
	public List<Product> listAllProducts()throws ClassNotFoundException,SQLException;
	Product getProductById(String id)throws ClassNotFoundException,SQLException;
	}
