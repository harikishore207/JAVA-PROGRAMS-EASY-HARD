/*  2.	Write a program called PrintDayInWord which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "dayNumber" is 0, 1, ..., 6, respectively.  Otherwise, it shall print "Not a valid day". Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
Try dayNumber = 0, 1, 2, 3, 4, 5, 6, 7 and verify your results.
  */

import java.util.Scanner;

public class p2 {
    public static  void s (int num)
    {
        switch (num)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
    public static void nif(int number)
    {
        if (number >= 0 && number <= 7) {
            // Nested if-else statements to print the word corresponding to the number
            if (number == 1) {
                System.out.println("Sunday");
            }
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("wednesday");
            } else if (number == 4) {
                System.out.println("thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            }
        } else {
            System.out.println("OTHER");
        }
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter a num:");
        int n= h.nextInt();
        s(n);
        nif(n);
    }
}
