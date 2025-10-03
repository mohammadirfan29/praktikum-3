package ArrayCollection;
import java.util.HashMap;

public class HashMappp {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("Indonesia", "Jakarta");
        capitals.put("Japan", "Tokyo");
        capitals.put("USA", "Washington DC");

        System.out.println("Ibukota Jepang: " + capitals.get("Japan"));

        // Looping isi HashMap
        for (String country : capitals.keySet()) {
            System.out.println(country + " -> " + capitals.get(country));
        }
    }
}
