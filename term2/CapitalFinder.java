package term2;

import java.util.HashMap;
import java.util.Map;


class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java CapitalFinder <CountryName>");
            return;
        }

        
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("UK", "London");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Germany", "Berlin");

        String country = args[0].trim();

        try {
            if (!countryCapitalMap.containsKey(country)) {
                throw new NoMatchFoundException("No match found for country: " + country);
            }
            
            System.out.println("The capital of " + country + " is " + countryCapitalMap.get(country));
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

