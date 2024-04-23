import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        System.out.println("enter the month:");
        Scanner h=new Scanner(System.in);
        int month= h.nextInt();
        System.out.println("enter the day:");
        int day= h.nextInt();


        if (args.length == 0) {
        } else {
            try {
                int integerValue = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer format. Please provide a valid integer.");
            }
        }
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid data");
        }
        if ((month == 3 && day >= 21) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Spring");
        } else if ((month == 6 && day >= 21) || (month > 6 && month < 9) || (month == 9 && day <= 22)) {
            System.out.println("Summer");
        } else if ((month == 9 && day >= 23) || (month > 9 && month < 12) || (month == 12 && day <= 21)) {
            System.out.println("Fall");
        } else if ((month == 12 && day >= 22) || (month == 1) || (month == 2) || (month == 3 && day <= 20)) {
            System.out.println("Winter");
        } else {
            System.out.println("Invalid data");
        }
    }
}
