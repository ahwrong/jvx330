package com.varxyz.jvx330.jdbc.example2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.jvx330.jdbc.Customer;
import com.varxyz.jvx330.jdbc.DataSourceConfig;

public class CustomerDaoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		
		CustomerDao dao = context.getBean("customerDao", CustomerDao.class);
//		findAllCustomers(dao);
		findCustomersByRegDate(dao);
		findCustomersBySsn(dao);
		context.close();
	}
	
//	public static void findAllCustomers(CustomerDao dao) {
//		System.out.println("[findAllCustomers()]");
//		dao.findAllCustomer().forEach(c -> System.out.println(c));
//	}
	
	public static void findCustomersByRegDate(CustomerDao dao) {
		System.out.println("[findAllCustomersByRegDate()]");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date currentDate = null;
		try {
			currentDate = format.parse(format.format(new Date()));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		List<Customer> list = dao.FindCustomerByRegDate(currentDate);
		for(Customer customer : list) {
			System.out.println(customer);
		}
	}
	
	public static void findCustomersBySsn(CustomerDao dao) {
		System.out.println("[findAllCustomersBySsn()]");
		
	}
}

// 주민번호 찍어보기
