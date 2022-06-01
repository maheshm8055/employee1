package com.employee.banking;

public class BankingOperations {
	private double balance=10000;
	
	public void withDraw(double amout) {
		 this.balance = this.balance - amout; 
	}
	
	public void displayBalance() {
		System.out.println("current balance is::"+balance);
	}

}
