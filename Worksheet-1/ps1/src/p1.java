/*Question:Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
        lessThan100 (22, 15) ➞ true // 22 + 15 = 37
        lessThan100 (83, 34) ➞ false // 83 + 34 = 117
        lessThan100 (3, 77) ➞ true*/


import java.util.Scanner;

public class p1 {
    public static boolean add(int a,int b){
        int c=a+b;
        return (c<=100);
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int n1= h.nextInt();
        int n2= h.nextInt();
        boolean result = add(n1,n2);
        System.out.println(result);

    }
}
