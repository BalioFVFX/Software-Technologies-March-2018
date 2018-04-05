package SumsByTown;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SumsByTown {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, Double> towns = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String townName = input[0].trim();
            Double townIncome = Double.parseDouble(input[1].trim());

            if(towns.containsKey(townName)){
                towns.put(townName, towns.get(townName) + townIncome);
            }
            else{
                towns.put(townName, townIncome);
            }
        }

        for (Map.Entry<String, Double> entry : towns.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}