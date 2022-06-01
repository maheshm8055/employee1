package com.employee.banking;

public class BankingOperations {
	private double balance=10000;
	
	public void withDraw(double amout) {
		 this.balance = this.balance - amout; 
	}
	
	//Bug-11
	public void deposite(double amount) {
		this.balance = this.balance + amount;
	}

}
