package BombNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> nums = new ArrayList<>();
        int[] bombNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            nums.add(numbers[i]);
        }

        while(nums.contains(bombNumbers[0])){
            for (int i = 0; i < bombNumbers[1]; i++) {
                if(nums.indexOf(bombNumbers[0]) != 0)
                {
                    nums.remove(nums.indexOf(bombNumbers[0]) - 1);
                }

                if(nums.indexOf(bombNumbers[0]) + 1 < nums.toArray().length)
                {
                    nums.remove(nums.indexOf(bombNumbers[0]) + 1);
                }

            }
            nums.remove(nums.indexOf(bombNumbers[0]));
        }
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
