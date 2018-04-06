package EqualSums;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int leftSum = 0;
        int rightSum = 0;
        int index = -1;

        if(numbers.length == 1){
            System.out.println(0);
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            leftSum += numbers[i];
            for (int j = numbers.length - 1; j >= i; j--) {
                rightSum += numbers[j];
                if(rightSum == leftSum){
                    index = i;
                }
            }
            rightSum = 0;
        }

        if(index != -1){
            System.out.println(index);
        }
        else{
            System.out.println("no");
        }


    }
}
