public class UncheckedExceptionExample {

    public static void main(String[] args) {
        // Attempt to access an array element that doesn't exist
        int[] numbers = {1, 2, 3};
        int index = 5;

        try {
            // This line will throw an ArrayIndexOutOfBoundsException
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // The program continues to execute after catching the exception
        System.out.println("Program continues...");
    }
}
