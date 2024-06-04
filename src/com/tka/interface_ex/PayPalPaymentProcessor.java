package com.tka.interface_ex;

public class PayPalPaymentProcessor implements PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		System.out.println("Payment process "+amount);
		return true;
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("payment validation..");
		return true;
	}

	@Override
	public boolean initiateTransaction() {
		System.out.println("Transaction initiate...");
		return true;
	}

}
