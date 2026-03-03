package oop.abstraction.project;

public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void completeOrder(double amount) {
        System.out.println("Processing order...");
        paymentService.pay(amount);
        System.out.println("Order completed successfully.");
    }
}