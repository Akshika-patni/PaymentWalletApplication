package com.capgemini.paymentapp.service;

import java.util.Map;

import com.capgemini.paymentapp.bean.PaymentApp;
import com.capgemini.paymentapp.dao.PaymentAppDao;

public class PaymentAppService implements IPaymentAppService {
  
	
	
	 PaymentAppDao dao=new PaymentAppDao();
	public boolean createAccount(PaymentApp paymentapp) {
		// TODO Auto-generated method stub
		return dao.createAccount(paymentapp);
	}

	public double showBalance() {
		// TODO Auto-generated method stub
		 return dao.showBalance();
		
	}
	public boolean logIn(String user_ID,String password)
	{
		return dao.logIn(user_ID,password);
	}

	public boolean deposite(double  amount) {
		// TODO Auto-generated method stub
		return dao.deposite(amount);
	}

	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		return dao.withdraw(amount);
	}

	public boolean fundTransfer(long receiverAccountNumber,double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(receiverAccountNumber,amount);
		
	}

	public Map<String,Double> printTranscation() {
		// TODO Auto-generated method stub
		return dao.printTranscation();
	}

}
