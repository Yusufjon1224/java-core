package oop.encapsulation;

public class ClassesChallengeBankAccount {

    public static void main (String[] args) {

        Account digosAccount = new Account();

        digosAccount.setNumber("54321");
        digosAccount.setBalance(1000.0);
        digosAccount.setCustomerName("Diyor Mavlonov");
        digosAccount.setCustomerEmail("myemail@digo.com");
        digosAccount.setNumber("(+998) 99-945-12-30");

        digosAccount.withDrawFunds(100.0);
        digosAccount.depositFounds(250.0);
        digosAccount.withDrawFunds(50.0);

        digosAccount.withDrawFunds(200.0);

        digosAccount.depositFounds(100.0);
        digosAccount.withDrawFunds(45.55);
        digosAccount.withDrawFunds(54.46);

        digosAccount.withDrawFunds(54.45);
    }
}
