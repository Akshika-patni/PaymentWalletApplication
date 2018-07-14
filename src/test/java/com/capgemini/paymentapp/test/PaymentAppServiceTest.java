package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.bean.Customer;
import com.capgemini.paymentapp.bean.Wallet;
import com.capgemini.paymentapp.service.PaymentAppService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentAppServiceTest extends TestCase {

	Customer c = new Customer();
	PaymentAppService ps = new PaymentAppService();

	public void testCreateAccount() {
		Assert.assertEquals(true, ps.createAccount(c));
		// Assert.assertEquals(false,ps.createAccount(null));

	}

}
