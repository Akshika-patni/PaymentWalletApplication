package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.service.PaymentAppValidate;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentAppValidateTest extends TestCase {
PaymentAppValidate v=new PaymentAppValidate();
	public void testValidatePhoneNo() {
		Assert.assertEquals(true,v.validatePhoneNo("1234569870"));
		Assert.assertEquals(false,v.validatePhoneNo("1234"));
		Assert.assertEquals(false,v.validatePhoneNo("1234$*&"));
		
		
	}

	public void testValidateCustomerName() {
		Assert.assertEquals(false,v.validateCustomerName(null));
		Assert.assertEquals(true,v.validateCustomerName("akshika"));
		
	}
	public void testValidateGenderName() {
		Assert.assertEquals(true,v.validateGenderName("female"));
		Assert.assertEquals(true,v.validateGenderName("Male"));
		Assert.assertEquals(false,v.validateGenderName("akshika"));
		Assert.assertEquals(false,v.validateGenderName("F"));
		Assert.assertEquals(false,v.validateGenderName("M"));
		
		
	}

}
