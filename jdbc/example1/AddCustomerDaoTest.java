package com.varxyz.jvx330.jdbc.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class AddCustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
	
		AddCustomerDao dao = context.getBean("addCustomerDao", AddCustomerDao.class);
//		addCustomer(dao);
//		addCustomer2(dao);
		addCustomer3(dao);
		
		context.close();
	}
	
	public static void addCustomer(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("kwanwu@java.com");
		c.setPasswd("2222");
		c.setName("관우");
		c.setSsn("930912-2345678");
		c.setPhone("010-5678-9123");
	    dao.addCustomer(c);
	    
	    System.out.println("-inserted-");
	}
	
	public static void addCustomer2(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("jangbi@java.com");
		c.setPasswd("3333");
		c.setName("장비");
		c.setSsn("940912-2345678");
		c.setPhone("010-3333-3333");
	    dao.addCustomer2(c);
	    
	    System.out.println("-inserted-");
	}
	
	public static void addCustomer3(AddCustomerDao dao) {
		Customer c = new Customer();
		c.setEmail("chocho@java.com");
		c.setPasswd("4444");
		c.setName("조조");
		c.setSsn("950912-2345678");
		c.setPhone("010-4444-4444");
	    dao.addCustomer3(c);
	    
	    long key = dao.addCustomer3(c);
	    System.out.println("-key-" + key);
	}
}
