import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add five integer elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Remove the third element (index 2)
        numbers.remove(2);

        // Update the second element (index 1) with a new value
        numbers.set(1, 25);

        // Display all elements using a loop
        System.out.println("ArrayList elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
