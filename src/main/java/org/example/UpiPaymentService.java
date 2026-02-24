package org.example;

public class UpiPaymentService implements PaymentService{

    @Override
    public void makePayment(double amount) {
        System.out.println("payment of Rs." + amount + " was made using UPI payment!!!");
    }
}
