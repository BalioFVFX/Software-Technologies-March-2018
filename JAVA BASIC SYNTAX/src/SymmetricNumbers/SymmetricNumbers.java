package SymmetricNumbers;

import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String reversedNum = "";
            String number = Integer.toString(i);
            String[] nums = number.split("");
            for (int j = nums.length - 1; j >= 0; j--) {
                reversedNum += nums[j];
            }
            if(number.equals(reversedNum)){
                System.out.println(i);
            }

        }
    }
}
