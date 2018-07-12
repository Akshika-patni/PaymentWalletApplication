package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.bean.Customer;

import com.capgemini.paymentapp.dao.PaymentAppDao;


import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentAppDaoTest extends TestCase {
PaymentAppDao dao=new PaymentAppDao();
 Customer c=new Customer();
	public void testCreateAccount() {
		Assert.assertEquals(true,dao.createAccount(c));
		
	}
	

	public void testShowBalance() {
		
		Assert.assertEquals(1000,dao.showBalance());
	}

	public void testDeposite() {
		Assert.assertEquals(true,dao.deposite(100.0));
	}

	public void testWithdraw() {
		Assert.assertEquals(false,dao.withdraw(0));
		
	}

	


}
