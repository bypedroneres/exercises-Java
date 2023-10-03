// **Exercise 2: String Set**

// - Create a set of strings and add some words to it.
// - Check if a specific word is in the set and print a message accordingly.
// - Print the size of the set.
// - Clear the set and check if it's empty.

import java.util.HashSet;
import java.util.Set;

public class StringSet {
    public static void main(String[] args) {
        // Create a set of strings
        Set<String> stringSet = new HashSet<>();

        // Add some names to the set
        stringSet.add("Pedro");
        stringSet.add("Brenda");
        stringSet.add("Bruno");

        // Check if a specific word is in the set
        String nameToCheck = "Pedro";
        if (stringSet.contains(nameToCheck)) {
            System.out.println(nameToCheck + " is in the set.");
        } else {
            System.out.println(nameToCheck + " is not in the set.");
        }

        // Print the size of the set
        int setSize = stringSet.size();
        System.out.println("Size of the set: " + setSize);

        // Clear the set and check if it's empty
        stringSet.clear();
        if (stringSet.isEmpty()) {
            System.out.println("The set is now empty.");
        } else {
            System.out.println("The set is not empty.");
        }
    }
}
