package com.onlineproject.service;

import java.sql.SQLException;

import com.onlineproject.bean.Customer;
import com.onlineproject.bean.ProductList;

public interface CustomerService {
	public boolean signingUp(Customer customer)throws ClassNotFoundException,SQLException;
	public boolean logingIn(String name, String Password)throws ClassNotFoundException,SQLException;
	public ProductList viewProduct()throws ClassNotFoundException,SQLException;
}
