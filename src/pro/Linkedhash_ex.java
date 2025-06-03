package pro;
import java.util.LinkedHashSet;

public class Linkedhash_ex {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");
        System.out.println(fruits);
    }
}