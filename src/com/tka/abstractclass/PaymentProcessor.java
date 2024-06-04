package com.tka.abstractclass;

public abstract class PaymentProcessor {
	public void logTransaction() {
		System.out.println("log Transfer....");
	}
	
	public abstract boolean processPayment(double amount);

	public abstract boolean validatePaymentDetails();

	public abstract boolean initiateTransaction();
	
	public PaymentProcessor() {
		
	}


}
