package com.capgemini.paymentapp.test;

import junit.framework.TestCase;

public class PaymentAppTest extends TestCase {

	public void testToString() {
		fail("Not yet implemented");
	}

	public void testGetBalance() {
		fail("Not yet implemented");
	}

	public void testGetCustomerName() {
		assertEquals("akshika","");
		assertEquals("akshika","akshika");
	}

	public void testGetAccountNumber() {
		assertEquals(1234356588,554534535);
		assertEquals(1234356588,"");
		
	}

	public void testGetAddress() {
		assertEquals("Jaipur","Jap");
		assertEquals("Hyderabad","hyd");
	}

	public void testGetPhoneNumber() {
		assertEquals(234567811,23901);
	}

	public void testGetAod() {
		assertEquals("7/10/2018","7/10/2018");
	}

	public void testGetGender() {
		assertEquals("female","famale");
		assertEquals("female","Famale");
		assertEquals("Male","male");
		assertEquals("Male","Male");
	}

	public void testGetAge() {
		assertEquals("21","famale");
	}
	public void testGetUser_ID() {
		assertEquals("akshika@gmail.com","akshika@gmail.com");
		assertEquals("akshika@gmailpatni","akshikapatni");
		assertEquals("akshika@gmail.com","akshi12345");
		
	}

	public void testGetPassword() {
		fail("Not yet implemented");
	}

}
