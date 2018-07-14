package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.bean.Customer;

import com.capgemini.paymentapp.dao.PaymentAppDao;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentAppDaoTest extends TestCase {
	PaymentAppDao dao = new PaymentAppDao();
	Customer c = new Customer();

	public void testCreateAccount() {
		Assert.assertEquals(true, dao.createAccount(c));

	}

}
