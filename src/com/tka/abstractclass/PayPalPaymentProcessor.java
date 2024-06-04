package com.tka.abstractclass;

public class PayPalPaymentProcessor extends PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		System.out.println("Payment process "+amount);
		logTransaction();
		return true;
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("payment validation..");
		logTransaction();
		return true;
	}

	@Override
	public boolean initiateTransaction() {
		System.out.println("Transaction initiate...");
		logTransaction();
		return true;
	}

}
