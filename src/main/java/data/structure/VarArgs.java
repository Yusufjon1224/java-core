package data.structure;

public class VarArgs {

    public static void main(String... args) {
        System.out.println("Hello World ");
        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {

        // enhanced for loop statement
        for (String t: textList) {
            System.out.println(t);
        }
    }
}
