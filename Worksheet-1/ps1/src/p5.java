/*Write a program that reads a sequence of integer values and determines whether it is a decreasing
        sequence. A decreasing sequence is one where each value is greater than or equal to the next
        element in the sequence. The program will first read the number of values to process followed by
        the values in the sequence. The program will print the message "Decreasing" for a decreasing
        sequence and "Non-Decreasing" otherwise.
        For example, here are two decreasing sequences:
        Input1: 90 87 30 0 -1 -2
        Input2: 110 4 0 -20
        The following are non-decreasing sequences:
        Input3: 90 100 20 4
        Input4: 30 24 -2 -1 8 9
        You may assume that the integer sequence will have at least two integer values and no two values
        will be equal*/


import java.util.Scanner;

public class p5 {
    public static boolean f(int[] array) {
        boolean d = true; // initialize to true

        for (int i = 0; i < array.length - 1; i++) {
          if (array[i] < array[i + 1]) {
                d = false;
            }
        }

        return d ;
    }


    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.println("Enter the size of the sequence:");
        int n = h.nextInt();

        int[] a = new int[n]; // Fix array initialization
        //int[] b;
        System.out.println("Enter the elements of the sequence:");
        for (int i = 0; i < n; i++) {
            a[i] = h.nextInt();
        }

       boolean c = f(a);
        if(c==true)
        {
            System.out.println("decreasing ");
        }
        else {
            System.out.println("non decreasing");
        }

    }
}
