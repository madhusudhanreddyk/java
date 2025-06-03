package pro;
import java.util.Scanner;

public class RainUmbrella {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user if it's raining
        System.out.print("Is it raining? (yes/no): ");
        String input = scanner.nextLine().trim().toLowerCase();

        // Check the input and respond accordingly
        if (input.equals("yes")) {
            System.out.println("Take an umbrella.");
        } else if (input.equals("no")) {
            System.out.println("No need of an umbrella.");
        } else {
            System.out.println("Invalid input. Please enter yes or no.");
        }

        scanner.close();
    }
}
