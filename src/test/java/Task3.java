import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Spain", "Madrid");
        capitalCities.put("United Kingdom", "London");

        System.out.println("Capital of Germany: " + capitalCities.get("Germany"));
        capitalCities.remove("Spain");

        for (String country : capitalCities.keySet()) {
            System.out.println(country + ": " + capitalCities.get(country));
        }

    }

}
