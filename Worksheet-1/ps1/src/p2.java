/*Question:Define a function that takes three integer values as formal arguments and returns "YOU WIN" if the
third formal argument value is between first and second arguments (both included). In the other case it
returns "YOU LOSE". Also check that second argument should not be lesser than the first argument. If so
continue, else display relevant error message.*/


import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (should be greater than or equal to the first): ");
        int num2 = scanner.nextInt();

        // Check if the second number is greater than or equal to the first
        if (num2 < num1) {
            System.out.println("Error: The second number should be greater than or equal to the first.");
        } else {
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            // Call the function and display the result
            String result = checkWin(num1, num2, num3);
            System.out.println(result);
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if the third number is between the first and second numbers
    static String checkWin(int first, int second, int third) {
        if (third >= first && third <= second) {
            return "YOU WIN";
        } else {
            return "YOU LOSE";
        }
    }
}
