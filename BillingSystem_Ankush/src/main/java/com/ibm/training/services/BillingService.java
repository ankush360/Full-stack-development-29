package com.ibm.training.services;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ibm.training.bean.ProductBean;
import com.ibm.training.dao.BillingDao;

@Service("billingService")
public class BillingService {
	
	@Autowired
	BillingDao daoObj ;

	
	

	
	float productTotal(ProductBean bean)
	
	{
		
		
		
		float price = daoObj.getPrice(bean.getProduct_code());
		
		float total = price * bean.getProduct_quantity();
		return total;
	}
	
	public void generateBill(ProductBean bean)
	
	{
		
		
		float productTotal = productTotal(bean);
		
		System.out.println("final total is " );
		System.out.println(productTotal);
		
		
		
		
		
		
		
	}
	@Autowired
	ProductBean bean1;
	
	public void generateFullBill(ProductBean bean)
	{
		 bean1 = daoObj.getFullBill(bean);
		
		System.out.println("Full bill is ");
		System.out.println("code is ");
		System.out.println(bean1.getProduct_code());
		System.out.println("category is : ");
		System.out.println(bean1.getProduct_category());
		System.out.println("name is : ");
		System.out.println(bean1.getProduct_name());
		System.out.println("Price : ");
		System.out.println(bean1.getProduct_price());
		//System.out.println("total is");
		
		generateBill(bean);
		
	}
	
	
	

}
