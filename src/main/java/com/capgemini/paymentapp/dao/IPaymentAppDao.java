package com.capgemini.paymentapp.dao;

import java.util.Map;

import com.capgemini.paymentapp.bean.PaymentApp;

public interface IPaymentAppDao {
	public boolean createAccount(PaymentApp paymentapp);

	public double showBalance();

	public boolean deposite(double amount);
	public boolean logIn(String user_ID,String password);

	public boolean withdraw( double amount);

	public boolean fundTransfer( long receiverAccountNumber,double amount);

	public Map<String,Double> printTranscation();
}
