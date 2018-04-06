package CensorEmailAddress;

import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String text = scanner.nextLine();

        while(text.contains(email)){
            text = text.replace(email, censorEmail(email));
        }
        System.out.println(text);
    }
    public static String censorEmail(String email){
        String censoredEmail = "";
        String domain = email.substring(email.indexOf("@"));
        for (int i = 0; i < email.length(); i++) {

             if(email.charAt(i) == '@'){
                 break;
             }
            censoredEmail += '*';

        }
        return censoredEmail + domain;
    }
}
