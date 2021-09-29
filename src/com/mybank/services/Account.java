package com.mybank.services;

public class Account {
	
	protected String ownerName;
	protected String address;
	protected double balanceAmount;
	protected String date;
	protected String status;
	
	public Account(String ownerName,String address,double balanceAmount,String date,String status) {
		this.ownerName = ownerName;
		this.address = address;
		this.balanceAmount = balanceAmount;
		this.date = date;
		this.status = status;
	}
	
	public void deposit(double depositAmount) {
		this.balanceAmount += depositAmount;
		System.out.println(depositAmount+" money has been deposited to your bank account");
		System.out.println("Your new balance is "+balanceAmount);
	}
	
	public void withdraw(double withdrawlAmount) {
		if(withdrawlAmount <= balanceAmount) {
			balanceAmount -= withdrawlAmount;
			System.out.println(withdrawlAmount+" money has been deposited to your bank account");
		}else {
			System.out.println("Sorry! you dont have enough balance in your account");
		}
	}
	
	public double checkBalance() {
		return balanceAmount;
	}
	
}
