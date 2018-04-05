package ReverseCharacters;

import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = "";
        for (int i = 0; i < 3; i++) {
            letters += scanner.nextLine();
        }
        System.out.println(new StringBuilder(letters).reverse());
    }
}
