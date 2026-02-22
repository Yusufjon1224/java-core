package data.structure;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {


        int[] unsortedArray = getRandomArray(5);
        System.out.println("Unsorted array = " + Arrays.toString(unsortedArray));

        int [] sortedArray = sortedIntegers(new int[] {7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));

        int[] myArray = {4, 5, 45, 56, 34};
        for (int myInt: myArray) {
            System.out.println("value " + myInt);
        }

    }

    public static int [] getRandomArray(int len) {
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
    }

    private static int[] sortedIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("-------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
