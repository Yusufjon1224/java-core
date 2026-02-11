package oop.encapsulation;

public class ClassesPartCar {
    public static void main(String[] args) {

        Car car = new Car();

        // Setters
        car.setMake("Porsche");
        car.setModel("CARRERA");
        car.setColor("BLACK");
        car.setDoors("4");
        car.setConvertible(false);

        // Getters
        System.out.println(" make = " + car.getMake());
        System.out.println(" model = " + car.getModel());
        System.out.println(" color = " + car.getColor());
        System.out.println(" doors = " + car.getDoors());
        System.out.println(" isConvertible = " + car.isConvertible());
        car.describeCar();

        Car targa = new Car();

        // Setters
        targa.setMake("Masserati");
        targa.setModel("CARRERA");
        targa.setColor("BLACK");
        targa.setDoors("4");
        targa.setConvertible(false);

        targa.describeCar();

    }
}
