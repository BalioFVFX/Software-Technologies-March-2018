package VowelOrDigit;

import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().toUpperCase().charAt(0);

        if(input >= 48 && input <= 57){
            System.out.println("digit");
            return;
        }

        switch(input){
            case 65:
            case 69:
            case 73:
            case 79:
            case 85:
            case 89:
                System.out.println("vowel");
                break;
            default:
                System.out.println("other");
        }

    }
}
