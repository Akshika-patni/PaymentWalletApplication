package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.bean.Customer;
import com.capgemini.paymentapp.bean.Wallet;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {
	Customer c=new Customer();
	public void testGetWallet() {
		Wallet w=new Wallet();
		c.setWallet(w);
		assertEquals(w,c.getWallet());
		
		
	}

	public void testGetCustomerName() {
		c.setCustomerName("akshika");
		assertEquals("akshika",c.getCustomerName());
	}

	public void testGetAddress() {
		c.setAddress("Jaipur");
		assertEquals("Jaipur",c.getAddress());
	}

	public void testGetPhoneNumber() {
		c.setPhoneNumber("9414686242");
		assertEquals("9414686242",c.getPhoneNumber());
	}

	public void testGetGender() {
		c.setGender("Female");
		assertEquals("Female",c.getGender());
		c.setGender("Male");
		assertEquals("Male",c.getGender());
	}

	public void testGetAge() {
		c.setAge(21);
		assertEquals(21,c.getAge());
	}

	public void testGetUser_ID() {
		c.setUser_ID("akshika@gmail.com");
		assertEquals("akshika@gmail.com",c.getUser_ID());
	}

	public void testGetPassword() {
		assertEquals("12345", "12345");
		assertEquals("akshika12345", "akshika12345");
		assertEquals("akshika", "akshika");
		assertEquals("akshika@_123", "akshika@_123");
	}

}
