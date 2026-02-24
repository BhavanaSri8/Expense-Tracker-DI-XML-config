package org.example;

public class CreditCardPaymentService implements PaymentService{
    public void makePayment(double amount) {
        System.out.println("payment of Rs." + amount + " was made using Credit Card payment!!!");
    }
}
