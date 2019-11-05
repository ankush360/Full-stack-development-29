package com.ibm.training.ui;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.ibm.training.bean.ProductBean;
import com.ibm.training.services.BillingService;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
	//ProductBean obj = new ProductBean();
    public static void main( String[] args )
    
    
    {

    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("billingContext.xml");
    	BillingService serve = context.getBean("billingService" , BillingService.class);
    	ProductBean bean = context.getBean("productBean", ProductBean.class);
    	

		//JDBCDao dao = context.getBean("jdbcDao", JDBCDao.class);
		
    	System.out.println(" 1 :- Generate Bill by entering product code and quantity");
        System.out.println("2:- Exit");
        
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        
        switch (choice)
        {
        
        
        	case 1 : 
        		generateBill(bean,serve);
        		
        		break;
        		
        		
        	
        	
        		default: System.out.println("wrong choice enter correct value ");
        
        
        }
        
        
        	
            
        
       }
    
   public static void generateBill(ProductBean bean,BillingService serve)
    {
    	System.out.println("enter Product code ");
    	Scanner scan  = new Scanner(System.in);
    	bean.setProduct_code(scan.nextInt());
    	System.out.println("Enter the quantity");
    	bean.setProduct_quantity(scan.nextInt());
    	
    	serve.generateFullBill(bean);
    	
    	
    }
    
    
}
