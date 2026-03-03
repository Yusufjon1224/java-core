# Abstraction Example in Java

## 📌 Overview

This project demonstrates the Abstraction principle of Object-Oriented Programming (OOP) in Java.

Abstraction is achieved using an interface (`PaymentService`) and multiple implementations (`CardPaymentService`, `PaypalPaymentService`).

The `OrderService` depends on the interface instead of concrete implementations, which ensures loose coupling and flexibility.

---

## 🧠 What is Abstraction?

Abstraction is an OOP principle that hides implementation details and exposes only essential behavior.

In this example:

- `PaymentService` defines the behavior.
- Concrete classes implement the behavior.
- `OrderService` works with the abstraction, not with specific implementations.

---

## 🚀 Why This Design is Important?

- Promotes loose coupling
- Supports polymorphism
- Makes the system scalable
- Allows easy extension (add new payment methods without modifying existing logic)

---

## 🏗 Project Structure

```
PaymentService        → Abstraction (Interface)
CardPaymentService    → Implementation
PaypalPaymentService  → Implementation
OrderService          → Business Logic
Main                  → Demo
```

---

## 🎯 Key OOP Concepts Demonstrated

- Abstraction
- Polymorphism
- Dependency Injection (manual)
- Clean Architecture principle

---

## 💡 How to Extend

To add a new payment method:

1. Create a new class implementing `PaymentService`
2. Pass it to `OrderService`

No changes required in existing business logic.