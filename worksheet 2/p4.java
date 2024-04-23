/*


*/


import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        System.out.println("enter the wind speed:");
        Scanner h=new Scanner(System.in);
        int w= h.nextInt();


        if (args.length == 0) {
        } else {
            // Convert the first command-line argument to an integer
            try {
                int integerValue = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer format. Please provide a valid integer.");
            }
        }
        if(w>=74 && w<=95)
        {
            System.out.println("Category 1");
        } else if (w>=96 && w<=110) {
            System.out.println("Category 2");
        } else if (w>=111 && w<=130) {
            System.out.println("Category 3");
        } else if (w>=131 && w<=155) {
            System.out.println("Category 4");
        } else if (w>155) {
            System.out.println("Category 5");
        }
        else{
            System.out.println("Harmless hurricane");
        }

    }
}
