package CompareCharArrays;

import java.util.Scanner;

public class CompareCharArrays {

    public static void printArray(char[] arr){
        for (char c : arr) {
            System.out.print(c);
        }
    }

    public static void main(String[] args) {

        int firstWordsCounter = 0;
        int secondWordsCounter = 0;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replaceAll(" ", "");
        char[] firstWords = input.toCharArray();
        input = scanner.nextLine();
        input = input.replaceAll(" ", "");
        char[] secondWords = input.toCharArray();

        if(firstWords.length < secondWords.length){
            printArray(firstWords);
            System.out.println();
            printArray(secondWords);
            System.out.println();

            return;
        }
        else if(firstWords.length == secondWords.length) {
            for (int i = 0; i < firstWords.length; i++) {
                if (firstWords[i] < secondWords[i]) {
                    firstWordsCounter++;
                } else {
                    secondWordsCounter++;
                }

            }


            if (firstWordsCounter >= secondWordsCounter) {
                printArray(firstWords);
                System.out.println();
                printArray(secondWords);
                System.out.println();
            } else {
                printArray(secondWords);
                System.out.println();
                printArray(firstWords);
                System.out.println();
            }
        }
        else if(secondWords.length < firstWords.length)
        {
            printArray(secondWords);
            System.out.println();
            printArray(firstWords);
            System.out.println();
            return;
        }
    }
}