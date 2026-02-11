package oop.encapsulation;

public class Car {
    private String make = "BMW";
    private String model = "M 8";
    private String color = "BLACK";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake (String make) {
        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setDoors (String doors) {
        this.color = color;
    }

    public void setConvertible (boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + " - Door " + color + " " + make + " " + model + " " + (convertible ? " Convertible " : " "));
    }
}
