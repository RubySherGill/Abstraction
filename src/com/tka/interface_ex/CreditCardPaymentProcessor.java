package com.tka.interface_ex;

public class CreditCardPaymentProcessor implements PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		System.out.println("Payment Process: "+amount);
		return true;
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("payment validation...");
		return false;
	}

	@Override
	public boolean initiateTransaction() {
		System.out.println("Transaction initiate..");
		return false;
	}

}
