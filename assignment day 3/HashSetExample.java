import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of strings
        HashSet<String> cities = new HashSet<>();

        // Add five city names, including a duplicate
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("London"); // Duplicate entry

        // Display the elements
        System.out.println("Cities in the HashSet: " + cities);

        // Check if a particular city exists
        String checkCity = "Tokyo";
        if (cities.contains(checkCity)) {
            System.out.println(checkCity + " is present in the set.");
        } else {
            System.out.println(checkCity + " is not in the set.");
        }

        // Remove a city and display the updated set
        cities.remove("Paris");
        System.out.println("Updated HashSet after removal: " + cities);
    }
}
