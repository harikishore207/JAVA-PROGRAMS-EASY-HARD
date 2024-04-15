import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the cylinder
        System.out.print("Enter the radius of the cylinder: ");

        // Read the radius from the user
        double radius = scanner.nextDouble();

        // Prompt the user to enter the length of the cylinder
        System.out.print("Enter the length of the cylinder: ");

        // Read the length from the user
        double length = scanner.nextDouble();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Calculate the area of the cylinder's base
        double area = Math.PI * Math.pow(radius, 2);

        // Calculate the volume of the cylinder
        double volume = area * length;

        // Display the result
        System.out.println("The volume of the cylinder is: " + volume);
    }
}
