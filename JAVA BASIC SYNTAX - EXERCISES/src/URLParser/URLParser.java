package URLParser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String protocol = "";
        String server = "";
        String resource = "";


        final String regex = "([a-zA-Z]+:[\\/]{2})*([a-zA-Z.]+)([\\/].*)*";
        final String input = scanner.nextLine();

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(input);
        while(matcher.find()){

            if(matcher.group(1) != null){
                protocol = matcher.group(1);
            }

            if(matcher.group(2) != null){
                server = matcher.group(2);
            }
            server = matcher.group(2);
            if(matcher.group(3) != null){
                resource = matcher.group(3);
            }

        }
        protocol = protocol.replace("://", "");
        if(resource != ""){
            resource = resource.substring(1);
        }
        System.out.println("[protocol] = \"" + protocol + "\"");
        System.out.println("[server] = \"" + server + "\"");
        System.out.println("[resource] = \"" + resource + "\"");
    }
}
