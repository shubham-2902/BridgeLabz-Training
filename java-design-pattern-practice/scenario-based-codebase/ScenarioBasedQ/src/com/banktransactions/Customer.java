package com.banktransactions;

public class Customer extends Thread {
	//private int customerId;
	private int accountNumber;
	private Bank bank;

	public Customer( int accountNumber, Bank bank) {
		super();
		//this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.bank = bank;
	}

	@Override
	public void run() {
		try {
			bank.deposit(accountNumber, 2000);
			Thread.sleep(500);
			bank.withdraw(accountNumber, 33000);
			Thread.sleep(500);
			bank.deposit(accountNumber, 4000);
			Thread.sleep(200);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
