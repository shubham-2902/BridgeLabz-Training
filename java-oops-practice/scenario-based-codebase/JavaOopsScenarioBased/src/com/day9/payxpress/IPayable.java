package com.day9.payxpress;

public interface IPayable {

	void pay (int daysLate);
	void sendReminder();
}
