package ThreeIntegersSum;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeIntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream((input.split(" "))).mapToInt(Integer::parseInt).toArray();

        if(numbers[0] + numbers[1] == numbers[2]){
            System.out.println(Math.min(numbers[0], numbers[1]) + " + " + Math.max(numbers[0], numbers[1]) + " = " + numbers[2]);
        }
        else if(numbers[1] + numbers[2] == numbers[0]){
            System.out.println(Math.min(numbers[1], numbers[2]) + " + " + Math.max(numbers[1], numbers[2]) + " = " + numbers[0]);

        }
        else if(numbers[2] + numbers[0] == numbers[1]){
            System.out.println(Math.min(numbers[0], numbers[2]) + " + " + Math.max(numbers[0], numbers[2]) + " = " + numbers[1]);

        }
        else{
            System.out.println("No");
        }
    }
}
