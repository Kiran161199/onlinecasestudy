package com.catalogserviceproject.service;

import java.sql.SQLException;
import java.util.List;
import com.catalogserviceproject.bean.Product;
import com.catalogserviceproject.persistance.ProductDao;
import com.catalogserviceproject.persistance.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {

	ProductDao productDao=new ProductDaoImpl();	
	@Override
	public List<Product> viewAllProduct() throws ClassNotFoundException, SQLException {
			
			return productDao.listAllProducts();
		}

	@Override
	public Product getProductItemsByCode(String code) throws ClassNotFoundException, SQLException {
		return productDao.getProductById(code);
	}
	
	
}
