package BooleanVariable;

import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("True")){
            System.out.println("Yes");
        }
        else if(input.equals("False")){
            System.out.println("No");
        }
    }
}
