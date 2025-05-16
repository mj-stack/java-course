package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("India", "Delhi");
        countries.put("Nepal", "Kathmandu");
        countries.put("SriLanka", "Colombo");
        countries.put("USA", "New York");
        countries.put("Afghanistan", "Kabul");

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to atlas app \n");
        System.out.print("Enter the country's name to check the capital city: ");
        String countryName = input.next();

        if (countries.containsKey(countryName)) {
            System.out.printf("Capital city is: %s", countries.get(countryName));
        } else {
            System.out.println("Sorry, country not available");
        }
    }
}
