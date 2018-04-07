package PhonebookUpgrade;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();
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
            else if(input[0].equals("ListAll")){
                for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }

            input = scanner.nextLine().split(" ");
        }
    }
}
