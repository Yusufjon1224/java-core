package lambda.lambdaExpressions;

import java.util.Arrays;
import java.util.function.Consumer;

public class MiniChallenge {

    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };


        // lambda usage
        Consumer<String> printLambdaWords = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printWords.accept("Let's split this up into an array");
        System.out.println("------------------");

        printLambdaWords.accept("Let's split this up into an array");
        System.out.println("------------------");

        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWordsForEach.accept("Let's split this up into an array");

        System.out.println("------------------");

        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printWordsConcise.accept("Let's split this up into an array");



    }

    public static String everySecondChar(String resource) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < resource.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(resource.charAt(i));
            }
        }
        return returnVal.toString();
    }
}
