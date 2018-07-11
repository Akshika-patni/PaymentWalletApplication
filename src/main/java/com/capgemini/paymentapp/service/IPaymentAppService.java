package com.capgemini.paymentapp.service;

import java.util.Map;

import com.capgemini.paymentapp.bean.PaymentApp;

public interface IPaymentAppService {
	public boolean createAccount(PaymentApp paymentapp);

	public double showBalance();
	public boolean logIn(String user_ID,String password);

	public boolean deposite(double amount);

	public boolean withdraw( double amount);

	public boolean fundTransfer( long receiverAccountNumber,double amount);

	public Map<String,Double> printTranscation();
}
