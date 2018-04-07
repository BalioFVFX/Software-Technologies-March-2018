package Phonebook;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        while(!input[0].equals("END")){

            if(input[0].equals("A")){
                    phoneBook.put(input[1], input[2]);

            }else if(input[0].equals("S")){
                if(phoneBook.containsKey(input[1])){
                    System.out.println(input[1] + " -> " + phoneBook.get(input[1]));
                }
                else{
                    System.out.println("Contact " + input[1] + " does not exist.");
                }
            }

            input = scanner.nextLine().split(" ");
        }
    }
}
