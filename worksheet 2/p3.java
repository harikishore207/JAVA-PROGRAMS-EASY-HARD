/*3.	Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise. */


public class p3 {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            // Convert the first command-line argument to an integer
            try {
                int integerValue = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer format. Please provide a valid integer.");
            }

            // Display each command-line argument
            System.out.println("Command-line arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }

            // Check if the first three arguments are equal
            if (args.length >= 3 && args[0].equals(args[1]) && args[1].equals(args[2])) {
                System.out.println("Arguments are equal");
            }
            else {
                System.out.println("Arguments are not equal");
            }
        }
    }
}
