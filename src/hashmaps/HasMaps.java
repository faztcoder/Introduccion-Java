package hashmaps;

import java.util.HashMap;

public class HasMaps {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("GDL", "Guadalajara");
        capitalCities.put("HUX", "Huatulco");

        System.out.println("Recuprando calve...");
        System.out.println(capitalCities.get("GDL"));

        System.out.println("recuperando todo el capitalCities: " + capitalCities);

        // para llave
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        // para valores
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

    }
}
