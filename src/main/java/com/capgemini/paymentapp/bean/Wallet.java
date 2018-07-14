package com.capgemini.paymentapp.bean;

import java.time.LocalDate;
import java.util.List;

public class Wallet {
	private long accountNumber;
	private LocalDate aod;
	private double initalBalance;
	private List<String> transaction;
	
	public List<String> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<String> transaction) {
		this.transaction = transaction;
	}
	public LocalDate getAod() {
		return aod;
	}
	@Override
	public String toString() {
		return "Wallet [accountNumber=" + accountNumber + ", aod=" + aod + ", initalBalance=" + initalBalance + "]";
	}
	public double getInitalBalance() {
		return initalBalance;
	}
	public void setInitalBalance(double initalBalance) {
		this.initalBalance = initalBalance;
	}
	public void setAod(LocalDate aod) {
		this.aod = aod;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
