// **Exercise 3: Iterate and Sum**

// - Create a set of integers and add some numbers to it.
// - Iterate through the set and calculate the sum of all numbers in the set.

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class IntegerSet {
    public static void main(String[] args) {
        // Create a set of integers
        Set<Integer> integerSet = new HashSet<>();

        // Add some numbers to the set
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(15);
        integerSet.add(20);

        // Initialize a variable to store the sum
        int sum = 0;

        // Iterate through the set and calculate the sum
        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            sum += number;
        }

        // Print the sum
        System.out.println("Sum of numbers in the set: " + sum);
    }
}
