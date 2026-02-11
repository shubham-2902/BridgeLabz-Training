package com.banktransactions;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	private Map<Integer, Integer> accounts = new HashMap<>();

	public Bank() {
		accounts.put(101, 10000);
		accounts.put(102, 12000);
		accounts.put(103, 15000);
	}

	public synchronized void deposit(int accountNumber, int amount) {
		int currentBalance = accounts.get(accountNumber);
		int newBalance = amount + currentBalance;
		accounts.put(accountNumber, newBalance);
		System.out.println(Thread.currentThread().getName() + " deposited " + amount + " into account " + accountNumber
				+ " Now new balance is --  " + newBalance);
	}

	public synchronized void withdraw(int accountNumber, int amount) {
		int currentBalance = accounts.get(accountNumber);
		if(currentBalance>=amount) {
		int newBalance = currentBalance-amount;
		accounts.put(accountNumber, newBalance);
		System.out.println(Thread.currentThread().getName() + " withdraw " + amount + " into account " + accountNumber
				+ " Now new balance is --  " + newBalance);
		}
		else {
			System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " into account " + accountNumber
					+ " but due to insufficient balance it could not be processed");
			}
		}
	
	public synchronized int getBalance(int accountNumber) {
		return accounts.get(accountNumber);
	}
}


