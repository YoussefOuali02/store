package com.youpro.store;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment is " + amount);
    }
}
