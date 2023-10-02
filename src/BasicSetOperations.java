// **Exercise 1: Basic Set Operations**

// - Create a set of integers and add some numbers to it.
// - Remove a number from the set.
// - Check if a specific number is in the set and print a message accordingly.
// - Print the size of the set.
// - Clear the set and check if it's empty.

import java.util.HashSet;
import java.util.Set;

public class BasicSetOperations {
    public static void main(String[] args) {
        // Create a set of integers
        Set<Integer> integerSet = new HashSet<>();

        // Add some numbers to the set
        integerSet.add(5);
        integerSet.add(10);
        integerSet.add(15);

        // Check if a specific number is in the set and print a message
        int numberToCheck = 10;
        if (integerSet.contains(numberToCheck)) {
            System.out.println(numberToCheck + " is in the set.");
        } else {
            System.out.println(numberToCheck + " is not in the set.");
        }

        // Print the size of the set
        int setSize = integerSet.size();
        System.out.println("Size of the set: " + setSize);

        // Clear the set
        integerSet.clear();

        // Check if the set is empty and print a message
        if (integerSet.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println("The set is not empty.");
        }
    }
}

