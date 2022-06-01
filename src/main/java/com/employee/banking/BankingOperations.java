package com.employee.banking;

public class BankingOperations {
	private double balance=10000;
	
	public void withDraw(double amout) {
		 this.balance = this.balance - amout; 
	}

}
