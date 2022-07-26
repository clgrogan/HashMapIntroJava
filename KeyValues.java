import java.util.HashMap;

public class KeyValues {

    public static void main(String[] args) {
        String[] vegetables = new String[] { "Cauliflower", "Spaghetti Squash", "Parsley" };
        double[] prices = new double[] { 4.99, 1.99, 6.99 };

        HashMap<String, Double> itemsHashMap = new HashMap<String, Double>();

        for (int i = 0; i < prices.length; i++) {
            itemsHashMap.put(vegetables[i], prices[i]);
        }

        System.out.println("\nGet the hashmap values by key which is the name of the item in this case:");
        System.out.println("itemsHashMap.get(\"Cauliflower\")" + itemsHashMap.get("Cauliflower"));
        System.out.println("itemsHashMap.get(\"Spaghetti Squash\")" + itemsHashMap.get("Spaghetti Squash"));
        System.out.println("itemsHashMap.get(\"Parsley\")" + itemsHashMap.get("Parsley"));

        System.out.println("\nUse the HashMap forEach() method to return the key and values for each item.");
        System.out.println("\titemsHashMap.forEach((key, value) -> {...}");
        itemsHashMap.forEach((key, value) -> {
            System.out.println("\t\tKey: " + key + " Value: " + value);
        });
        System.out.println("\nWe can update existing key values with put, and add more."
                + "\n We'll update parsley and add a couple more items.");
        itemsHashMap.put("Parsley", 10000.00);
        itemsHashMap.put("Rancid Fish", 1.00);
        itemsHashMap.put("Apples", 3.33);
        System.out.println("\titemsHashMap.put(\"Parsley\", 10000.00);");
        System.out.println("\titemsHashMap.put(\"Rancid Fish\", 1.00);");
        System.out.println("\titemsHashMap.put(\"Apples\", 3.33);");

        System.out.println("\nUse the HashMap forEach() method to return the key and values for each item.");
        System.out.println("  itemsHashMap.forEach((key, value) -> {...}");
        itemsHashMap.forEach((key, value) -> {
            System.out.println("\t\tKey: " + key + " Value: " + value);
        });
        System.out.println(
                "\nNote that the items may not appear in the same order with each run as"
                        + "\nHashMaps are unordered, as such they also do not have an index.\n");

    }

}
