package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.bean.PaymentApp;
import com.capgemini.paymentapp.dao.PaymentAppDao;


import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentAppDaoTest extends TestCase {
PaymentAppDao dao=new PaymentAppDao();
 PaymentApp pa=new PaymentApp();
	public void testCreateAccount() {
		Assert.assertEquals(true,dao.createAccount(pa));
		
	}
	

	public void testShowBalance() {
		Assert.assertEquals(0.0,dao.showBalance());
	}

	public void testDeposite() {
		Assert.assertEquals(true,dao.deposite(0));
	}

	public void testWithdraw() {
		Assert.assertEquals(true,dao.withdraw(0));
		
	}

	public void testFundTransfer() {
		Assert.assertEquals(false,dao.fundTransfer(12344567, 0));
	}


}
