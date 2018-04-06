package FitStringIn20Chars;

import java.util.Scanner;

public class FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.length() < 20){
            input += padRight(input.length(), '*');
        }
        else{
            input = input.substring(0, 20);
        }
        System.out.println(input);
    }

    public static String padRight(int start, char symbol){
        String output = "";
        for (int i = start; i < 20; i++) {
            output += symbol;
        }
        return output;
    }
}
