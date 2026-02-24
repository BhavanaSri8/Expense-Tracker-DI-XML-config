package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Object obj=context.getBean("hellobean");//downcasting
////        String msg=(String) context.getBean("msg");
////        System.out.println("Message from context: "+msg);
//        HelloService hs=(HelloService) obj;
//        hs.sayHello();
        Scanner sc=new Scanner(System.in);
        ExpenseTracker expenseTracker=(ExpenseTracker) context.getBean("expTracker");
        PaymentService ps=null;
        System.out.println("Enter 1.upi \n 2.dc  \n 3.cc");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                ps=(PaymentService) context.getBean("upi");
                break;
            case 2:
                ps=(PaymentService) context.getBean("debit");
                break;
            case 3:
                ps=(PaymentService) context.getBean("credit");
                break;
        }
        expenseTracker.setPaymentService(ps);
        expenseTracker.payRent(10000);
        expenseTracker.payElectricity(100);
        expenseTracker.payRecharge(250);
//        System.out.println("\n====================================================");
//        ExpenseTracker expenseTracker1=(ExpenseTracker) context.getBean("expTracker1");
//        expenseTracker1.payRent(20000);
//        expenseTracker1.payElectricity(100);
//        expenseTracker1.payRecharge(250);
//        System.out.println("\n====================================================");
//        ExpenseTracker expenseTracker2=(ExpenseTracker) context.getBean("expTracker2");
//        expenseTracker2.payRent(35000);
//        expenseTracker2.payElectricity(100);
//        expenseTracker2.payRecharge(250);
    }
}