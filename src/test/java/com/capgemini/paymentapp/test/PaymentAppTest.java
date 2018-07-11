package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.bean.PaymentApp;

import junit.framework.TestCase;

public class PaymentAppTest extends TestCase {
 PaymentApp pa=new PaymentApp();
	

	public void testGetBalance() {
	pa.setBalance(9423.0);
	assertEquals(9423.0,pa.getBalance());
	
	}

	public void testGetCustomerName() {
		pa.setCustomerName("akshika");
		assertEquals("akshika",pa.getCustomerName());
	}

	public void testGetAccountNumber() {
		pa.setAccountNumber(1234356588);
		assertEquals(1234356588,pa.getAccountNumber());
	
		
	}

	public void testGetAddress() {
		pa.setAddress("Jaipur");
		assertEquals("Jaipur",pa.getAddress());
	}

	public void testGetPhoneNumber() {
		pa.setPhoneNumber("9414686242");
		assertEquals("9414686242",pa.getPhoneNumber());
	}

	public void testGetAod() {
		assertEquals("7/10/2018","7/10/2018");
	}

	public void testGetGender() {
		pa.setGender("Female");
		assertEquals("Female",pa.getGender());
		pa.setGender("Male");
		assertEquals("Male",pa.getGender());
	}

	public void testGetAge() {
		pa.setAge(21);
		assertEquals(21,pa.getAge());
	}
	public void testGetUser_ID() {
		pa.setUser_ID("akshika@gmail.com");
		assertEquals("akshika@gmail.com",pa.getUser_ID());
		
		
		
	}

	public void testGetPassword() {
		assertEquals("12345", "12345");
		assertEquals("akshika12345", "akshika12345");
		assertEquals("akshika", "akshika");
		assertEquals("akshika@_123", "akshika@_123");
		
	}

}
