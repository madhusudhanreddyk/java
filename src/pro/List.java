package pro;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("ango");
        fruits.add("Orange");
        Collections.reverse(fruits);
        fruits.remove(0);
        System.out.println("Fruits List: " + fruits);
    }
}
