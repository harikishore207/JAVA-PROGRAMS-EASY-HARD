/* 1.	Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.   */


import java.util.Scanner;

public class p1 {
    public static  void s (int num)
    {
        switch (num)
        {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("Other");
        }
    }
    public static void nif(int number)
    {
        if (number >= 0 && number <= 9) {
            // Nested if-else statements to print the word corresponding to the number

            if (number == 0) {
                System.out.println("ZERO");
            }if (number == 1) {
                System.out.println("ONE");
            } else if (number == 2) {
                System.out.println("TWO");
            } else if (number == 3) {
                System.out.println("THREE");
            } else if (number == 4) {
                System.out.println("FOUR");
            } else if (number == 5) {
                System.out.println("FIVE");
            } else if (number == 6) {
                System.out.println("SIX");
            } else if (number == 7) {
                System.out.println("SEVEN");
            } else if (number == 8) {
                System.out.println("EIGHT");
            } else if (number == 9) {
                System.out.println("NINE");
            }
        } else {
            System.out.println("OTHER");
        }
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter a number:");
        int n= h.nextInt();

        s(n);
        nif(n);
    }
}
