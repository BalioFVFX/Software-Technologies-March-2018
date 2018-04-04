package Largest3Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int counter = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if(counter == 3){
                break;
            }
            System.out.println(numbers[i]);
            counter++;

        }

    }
}
