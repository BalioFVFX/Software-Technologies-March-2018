package IndexOfLetters;

import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int letterIndex = input.charAt(i) - 97;
            System.out.println(letter + " -> " + letterIndex);
        }
    }
}
