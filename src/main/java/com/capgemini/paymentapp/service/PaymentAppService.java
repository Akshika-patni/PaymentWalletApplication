package com.capgemini.paymentapp.service;

import java.util.List;
import java.util.Map;

import com.capgemini.paymentapp.bean.Customer;

import com.capgemini.paymentapp.dao.PaymentAppDao;

public class PaymentAppService implements IPaymentAppService {
  
	
	
	 PaymentAppDao dao=new PaymentAppDao();
	public boolean createAccount(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createAccount(customer);
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

	public  List<String> printTranscation() {
		// TODO Auto-generated method stub
		return dao.printTranscation();
	}

}
