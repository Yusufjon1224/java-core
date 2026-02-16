package oop.inheritance.challenge;

import static java.lang.Integer.parseInt;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    // if we remove that default constructor code, extends gives error in Employee subclass
    public Worker() {

    }

    Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2026;
        int birthYear = parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
