package com.ibm.training.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.ibm.training.bean.ProductBean;




@Repository("billingDao")
public class BillingDao {

	DataSource dataSource;

	JdbcTemplate jdbcTemplate;

//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//	public DataSource getDataSource() {
//		return dataSource;
//	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	void createConnectionThroughJDBCTemplate() throws SQLException {

		// Get the Connection
		Connection dbCon = dataSource.getConnection();

		//Or like this
//		jdbcTemplate.setDataSource(dataSource);
	}

	public Float  getPrice(int product_code) {
		//Write the query
		String qryFetch = "select product_price from product_details where product_code = ?";
		
		//Execute the query
		return jdbcTemplate.queryForObject(qryFetch, new Object[] {product_code}, Float.class);
	}
	
	public ProductBean getFullBill(ProductBean bean)
	{
		String query = " select * from product_details where product_code = ?";
		return jdbcTemplate.queryForObject(query, new Object[] {bean.getProduct_code()}, new UserMapper());
				
		
		
		
	}
}
	
	class UserMapper implements RowMapper<ProductBean>{

		public ProductBean mapRow(ResultSet rs, int rowNum) throws SQLException {
			//User user = new User();
			ProductBean bean = new ProductBean();
			bean.setProduct_category(rs.getString("product_category"));
			bean.setProduct_code(rs.getInt("product_code"));
			bean.setProduct_description(rs.getString("product_description"));
			bean.setProduct_price(rs.getFloat("product_price"));
			
			return bean;
		}
	}
	
	
	

		

		
	
	
	
	
	
	
	
	
	
	
	

