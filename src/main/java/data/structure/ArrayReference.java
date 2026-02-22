package data.structure;

import java.util.Arrays;

public class ArrayReference {

    public static void main(String[] args) {

        // myIntArray is reference and reference is an address to the object in memory not the object itself and myIntArray and anotherArray holds the same memory
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        modifyArray(myIntArray);

        System.out.println("MyInt array = " + Arrays.toString(myIntArray));
        System.out.println("Another array = " + Arrays.toString(anotherArray));

        myIntArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}
