package com.tka.interface_ex;

public interface PaymentProcessor {
	public abstract boolean processPayment(double amount);

	public abstract boolean validatePaymentDetails();

	public abstract boolean initiateTransaction();

	

}
