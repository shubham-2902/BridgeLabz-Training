package com.banktransactions;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Bank bank = new Bank();
		Customer c1 = new Customer( 101, bank);
		Customer c2 = new Customer( 102, bank);
		Customer c3 = new Customer( 103, bank);

		// Thread class provide this method for setting name of thread to specific name
		// instead of default zero
		c1.setName("Ram");
		c2.setName("Ramu");
		c3.setName("Ramesh");

		c1.start();
		c2.start();
		c3.start();

		// joins for waiting all threads to finish

		c1.join();
		c2.join();
		c3.join();

		System.out.println("Final Account balances");

		System.out.println("Account 101 " + bank.getBalance(101));
		System.out.println("Account 102 " + bank.getBalance(102));
		System.out.println("Account 103 " + bank.getBalance(103));

	}
}
