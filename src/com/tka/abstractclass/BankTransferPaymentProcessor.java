package com.tka.abstractclass;

public class BankTransferPaymentProcessor extends PaymentProcessor {

	@Override
	public boolean processPayment(double amount) {
		System.out.println("Bank Transfer Payment :"+amount);
		logTransaction();
		return true;
	}

	@Override
	public boolean validatePaymentDetails() {
		System.out.println("Payment validation....");
		logTransaction();
		return true;
	}

	@Override
	public boolean initiateTransaction() {
		System.out.println("Transaction initiated");
		logTransaction();
		return true;
	}

}
