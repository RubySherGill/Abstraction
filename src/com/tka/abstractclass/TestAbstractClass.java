package com.tka.abstractclass;

public class TestAbstractClass {

	public static void main(String[] args) {
		System.out.println("Credit Card Payment process ");
		PaymentProcessor processor = new CreditCardPaymentProcessor();
		processor.processPayment(5000);
		processor.validatePaymentDetails();
		processor.initiateTransaction();
		
		System.out.println("\nPayPal Payment Process");
		PaymentProcessor processor2 = new PayPalPaymentProcessor();
		processor2.processPayment(6000);
		processor2.validatePaymentDetails();
		processor2.initiateTransaction();
			
		System.out.println("\nBank Transfer Payment Process");
		PaymentProcessor processor3 = new BankTransferPaymentProcessor();
		processor3.processPayment(7000);
		processor3.validatePaymentDetails();
		processor3.initiateTransaction();


	}

}
