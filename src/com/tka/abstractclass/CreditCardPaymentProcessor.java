package com.tka.abstractclass;

public class CreditCardPaymentProcessor extends PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		System.out.println("Payment Process: "+amount);
		logTransaction();
		return true;
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("payment validation...");
		logTransaction();
		return false;
	}

	@Override
	public boolean initiateTransaction() {
		System.out.println("Transaction initiate..");
		logTransaction();
		return false;
	}

}
