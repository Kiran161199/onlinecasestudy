package com.catalogserviceproject.persistance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.catalogserviceproject.bean.Product;
import com.catalogserviceproject.helper.DbConnector;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> listAllProducts() throws ClassNotFoundException, SQLException {
		List<Product> productList = new ArrayList<Product>();
		
		Connection connection = DbConnector.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCT");
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			long id = resultSet.getLong("ID");
			String code = resultSet.getString("CODE");
			String name = resultSet.getString("NAME");
			String description = resultSet.getString("DESCRIPTION");
			double price = resultSet.getDouble("PRICE");
			
			Product product=new Product(id, code, name, description, price);
			productList.add(product);
		}

		connection.close();

		return productList;
	}

	@Override
	public Product getProductById(String id) throws ClassNotFoundException, SQLException {
		Connection connection = DbConnector.getConnection();
		Product prod=null;
		
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCT WHERE CODE=?");
	preparedStatement.setString(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		 if(resultSet.next()) {
			long productid = resultSet.getLong("ID");
			String code = resultSet.getString("CODE");
			String name = resultSet.getString("NAME");
			String description = resultSet.getString("DESCRIPTION");
			double price = resultSet.getDouble("PRICE");
			
		 prod=new Product(productid, code, name, description, price);
		}
		connection.close();
		return prod;
	}

	


	

	}




