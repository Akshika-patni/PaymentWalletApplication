package com.capgemini.paymentapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.paymentapp.bean.Customer;

import com.capgemini.paymentapp.bean.Wallet;
import com.capgemini.paymentapp.exception.InsufficientBalanceExp;

public class PaymentAppDao implements IPaymentAppDao {
	boolean flag = false;
	List<Customer> list = new ArrayList<Customer>();
	Map<String, Double> transaction = new HashMap<String, Double>();
	double tid;
	Customer ct = new Customer();
	static Wallet w=new Wallet();
	


	public boolean createAccount(Customer customer) {
		// TODO Auto-generated method stub
		flag = list.add(customer);
		return flag;

	}

	public boolean logIn(String user_ID, String password) {
		boolean b = false;
		for (Customer i : list) {

			if (i.getUser_ID().equals(user_ID) && i.getPassword().equals(password)) {
				b = true;
				ct = i;
				w=ct.getWallet();
			}
		}
		return b;
	}

	public double showBalance() {
		double d = 0.00;
		d =ct.getWallet().getInitalBalance();
		return d;
	}

	public boolean deposite(double amount) {
		// TODO Auto-generated method stub
		boolean b = false;
		double d=ct.getWallet().getInitalBalance()+amount;
		w.setInitalBalance(d);
		tid = (long) (Math.random() * 100000);
		String s=("With "+Double.toString(tid)+",Deposited amount is:");
		transaction.put(s, amount);
		b = true;
		return b;
	}

	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		boolean b4 = false;
		if (amount > w.getInitalBalance()) {
			try {
				throw new InsufficientBalanceExp();
			} catch (InsufficientBalanceExp e) {
				System.out.println("Insufficient Balance !!!!!!!!!");
			}
		} else {
			double d=ct.getWallet().getInitalBalance()-amount;
			w.setInitalBalance(d);
			tid = (long) (Math.random() * 100000);
			String s=("With "+Double.toString(tid)+",Withdraw amount is:");

			transaction.put(s, amount);
			b4 = true;

		}
		return b4;

	}

	public boolean fundTransfer(long receiverAccountNumber, double amount) {
		// TODO Auto-generated method stub
		boolean b1 = false;
		boolean b2 = false;
		tid = (long) (Math.random() * 100000);
		String s=("With "+Double.toString(tid)+",Transferred amount is:");
		transaction.put(s, amount);
		double d=ct.getWallet().getInitalBalance()-amount;
		w.setInitalBalance(d);
		b1 = true;
		for (Customer i : list) {
			if (i.getWallet().getAccountNumber() == receiverAccountNumber) {
				double d2=ct.getWallet().getInitalBalance()+amount;
				w.setInitalBalance(d2);
				b2 = true;
			}
		}
		if (b1 && b2)
			return true;
		else
			return false;

	}

	public Map printTranscation() {

		return transaction;

	}

}
