import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");

        // Read the temperature in Celsius from the user
        double celsius = scanner.nextDouble();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
    }
}
