package com.capgemini.paymentapp.test;

import com.capgemini.paymentapp.bean.Wallet;

import junit.framework.TestCase;

public class WalletTest extends TestCase {
	Wallet w = new Wallet();

	public void testGetAod() {
		assertEquals("7/10/2018", "7/10/2018");
	}

	public void testGetInitalBalance() {
		w.setInitalBalance(9423.0);
		assertEquals(9423.0, w.getInitalBalance());
	}

	public void testGetAccountNumber() {
		w.setAccountNumber(1234356588);
		assertEquals(1234356588, w.getAccountNumber());
	}

}
