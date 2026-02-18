package oop.inheritance.composition;

public class Main {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenStat(true, false, true);
        kitchen.doKitchenWork();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        // these are compositions calling
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();
//
//        kitchen.getDishWasher();
//        kitchen.getIceBox();
//        kitchen.getBrewMaster();
    }
}
