package MaxSequenceOfEqualElements;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bestStart = 0;
        int bestLength = 0;
        int counter = 0;
        int length = 0;
        for (int i = 0; i < numbersInput.length; i++) {
            for (int j = i + 1; j < numbersInput.length; j++) {
                int leftNumber = numbersInput[i];
                int rightNumber = numbersInput[j];
                if(leftNumber == rightNumber){
                    counter++;
                    if(counter > length){
                        bestStart = i;
                        bestLength = j;
                        length++;
                    }
                }
                else{
                    break;
                }
            }
            counter = 0;
        }

        for (int i = bestStart; i <= bestLength; i++) {
            System.out.print(numbersInput[i] + " ");

        }
}
}
