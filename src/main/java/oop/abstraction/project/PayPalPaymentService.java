package oop.abstraction.project;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        System.out.println("Paid " + amount + " using PayPal");
    }
}
