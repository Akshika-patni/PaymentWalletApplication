package com.capgemini.paymentapp.bean;

import java.time.LocalDate;

public class Wallet {
	private long accountNumber;
	private LocalDate aod;
	private double initalBalance;
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
