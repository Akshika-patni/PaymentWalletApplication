package com.capgemini.paymentapp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.paymentapp.bean.PaymentApp;
import com.capgemini.paymentapp.exception.InsufficientBalanceExp;

public class PaymentAppDao implements IPaymentAppDao {
	boolean flag = false;
	List<PaymentApp> list = new ArrayList<PaymentApp>();
	Map<String, Double> transaction = new HashMap<String, Double>();
	double tid;
	PaymentApp ps = new PaymentApp();

	public boolean createAccount(PaymentApp paymentapp) {
		// TODO Auto-generated method stub
		flag = list.add(paymentapp);
		return flag;

	}

	public boolean logIn(String user_ID, String password) {
		boolean b = false;
		for (PaymentApp i : list) {

			if (i.getUser_ID().equals(user_ID) && i.getPassword().equals(password)) {
				b = true;
				ps = i;
			}
		}
		return b;
	}

	public double showBalance() {
		double d = 0.00;
		d = ps.getBalance();
		return d;
	}

	public boolean deposite(double amount) {
		// TODO Auto-generated method stub
		boolean b = false;
		ps.setBalance(ps.getBalance() + amount);
		tid = (long) (Math.random() * 100000);
		String s=("With "+Double.toString(tid)+",Deposited amount is:");
		transaction.put(s, amount);
		b = true;
		return b;
	}

	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		boolean b4 = false;
		if (amount > ps.getBalance()) {
			try {
				throw new InsufficientBalanceExp();
			} catch (InsufficientBalanceExp e) {
				System.out.println("Insufficient Balance !!!!!!!!!");
			}
		} else {
			ps.setBalance(ps.getBalance() - amount);
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
		ps.setBalance(ps.getBalance() - amount);
		b1 = true;
		for (PaymentApp i : list) {
			if (i.getAccountNumber() == receiverAccountNumber) {
				i.setBalance(i.getBalance() + amount);
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
