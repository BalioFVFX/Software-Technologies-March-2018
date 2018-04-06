package ChangeToUppercase;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String regex = "<upcase>([A-Za-z 0-9.`]+)<\\/upcase>";
        String text = scanner.nextLine();

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            String leftSide = text.substring(0, text.indexOf(matcher.group(0)));
            String rightSide = text.substring(text.indexOf(matcher.group(0)) + matcher.group(0).length());
            text = leftSide + matcher.group(1).toUpperCase() + rightSide;
        }
        System.out.println(text);
    }
}
