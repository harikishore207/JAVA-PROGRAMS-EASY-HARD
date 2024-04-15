import java.util.Scanner;

public class p9 {
    static void pow(int a,int b){
        int c=a*b;
        System.out.println("power is :"+c);

    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the voltage:");
        int a=h.nextInt();
        System.out.println("enter the current:");
        int b=h.nextInt();
        pow(a,b);
    }
}

