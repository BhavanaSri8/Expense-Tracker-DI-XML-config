package org.example;

public class ExpenseTracker {

    PaymentService paymentService;
    EmailService es=new EmailService();

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


    public void payRent(double amount){
        es.notification("Going to pay rent");
        System.out.println("Pay Rent of Rs."+amount);
        paymentService.makePayment(amount);
    }

    public void payElectricity(double amount){
        es.notification("Going to pay Electricity Bill");
        System.out.println("Pay Electricity Bill of Rs."+amount);
        paymentService.makePayment(amount);
    }

    public void payRecharge(double amount){
        es.notification("Going to Recharge..");
        System.out.println("Recharge mobile with Rs."+amount);
        paymentService.makePayment(amount);
    }


}
