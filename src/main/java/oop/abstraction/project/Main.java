package oop.abstraction.project;

public class Main {

    public static void main(String[] args) {

        PaymentService cardPayment = new CardPaymentService();
        OrderService order1 = new OrderService(cardPayment);
        order1.completeOrder(100);

        System.out.println("-------------------");

        PaymentService paypalPayment = new PayPalPaymentService();
        OrderService order2 = new OrderService(paypalPayment);
        order2.completeOrder(200);
    }
}
