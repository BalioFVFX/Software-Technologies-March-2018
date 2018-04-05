package MostFrequentNumber;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int bestNumber = 0;
        int length = 0;
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    counter++;
                    if(counter > length){
                        bestNumber = numbers[i];
                        length++;
                    }
                }
            }
            counter = 0;
        }

        System.out.println(bestNumber);
    }
}
