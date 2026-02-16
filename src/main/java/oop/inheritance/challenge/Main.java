package oop.inheritance.challenge;

public class Main {

    public static void main (String[] args) {

        Employee digo = new Employee("Digo", "11/12/2003",  "01/01/2024");
        System.out.println(digo);
        System.out.println("Age = " + digo.getAge());
        System.out.println("Pay = " + digo.collectPay() );

        SalariedEmployee fazil = new SalariedEmployee("Fazik", "11/11/2003", "12/11/2025", 35000);
        System.out.println(fazil);

        System.out.println("Fazik's PayCheck = $" + fazil.collectPay() );
        fazil.retire();
        System.out.println("Fazik's pension check = $" + fazil.collectPay());

        HourlyEmployee shoxa = new HourlyEmployee("Shokha", "05/05/2000", "03/03/2023", 15);
        System.out.println(shoxa);
        System.out.println("Shoxa's Paycheck = $" + shoxa.collectPay());
        System.out.println("Shoxa's Holiday Pay = $" + shoxa.getDoublePay());
    }
}
