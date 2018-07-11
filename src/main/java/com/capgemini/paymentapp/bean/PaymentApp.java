package com.capgemini.paymentapp.bean;

import java.time.LocalDate;

public class PaymentApp {

	private String customerName;
	private long accountNumber;
	private String address;
	private String phoneNumber;
	private double balance;
	private LocalDate aod;
	private String gender;
	private int age;
	private String user_ID;
	private String password;

	@Override
	public String toString() {
		return "PaymentApp [customerName=" + customerName + ", accountNumber=" + accountNumber + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", balance=" + balance + ", aod=" + aod + ", gender=" + gender
				+ ", age=" + age + ", user_ID=" + user_ID + ", password=" + password + "]";
	}

	public String getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getAod() {
		return aod;
	}

	public void setAod(LocalDate aod) {
		this.aod = aod;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
