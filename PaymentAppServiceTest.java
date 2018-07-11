package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.bean.PaymentApp;
import com.capgemini.paymentapp.dao.PaymentAppDao;
import com.capgemini.paymentapp.service.PaymentAppService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class PaymentAppServiceTest extends TestCase {

 PaymentApp pa=new PaymentApp();
 PaymentAppService ps=new PaymentAppService();
	public void testCreateAccount() {
		Assert.assertEquals(true,ps.createAccount(pa));
		Assert.assertEquals(false,ps.createAccount(null));
		
	}

	public void testShowBalance() {
		Assert.assertEquals(0.0,ps.showBalance());
	}

	public void testDeposite() {
		Assert.assertEquals(true,ps.deposite(0));
	}

	public void testWithdraw() {
		Assert.assertEquals(true,ps.withdraw(0));
	}

	public void testFundTransfer() {
	assertEquals(false,ps.fundTransfer(12344567, 0));
	}

	

}
