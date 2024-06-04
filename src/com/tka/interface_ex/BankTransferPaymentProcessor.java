package com.tka.interface_ex;

public class BankTransferPaymentProcessor implements PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		System.out.println("Bank Transfer Payment :"+amount);
		return true;
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("Payment validation....");
		return true;
	}

	@Override
	public boolean initiateTransaction() {
		System.out.println("Transaction initiated");
		return true;
	}

}
