package AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AdvertisementMessage {
    public static void main(String[] args) {
     String[] phrases = new String[]{"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can't live without this product."};
     String[] events = new String[] {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
     String[] author = new String[] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
     String[] cities = new String[] {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

     Scanner scanner = new Scanner(System.in);
     int n = Integer.parseInt(scanner.nextLine());
     String sentence = "";
        for (int i = 0; i < n; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(0, phrases.length);
            sentence += phrases[randomNumber] + " ";
            randomNumber = ThreadLocalRandom.current().nextInt(0, events.length);
            sentence += events[randomNumber] + " ";
            randomNumber = ThreadLocalRandom.current().nextInt(0, author.length);
            sentence += author[randomNumber] + " ";
            randomNumber = ThreadLocalRandom.current().nextInt(0, cities.length);
            sentence += cities[randomNumber] + " ";
        }
        System.out.println(sentence);
    }
}
