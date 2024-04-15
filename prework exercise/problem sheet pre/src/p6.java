import java.util.Scanner;

public class p6 {
    static void add(int a,int b){
        int c=a+b;
        System.out.println("addtion is :"+c);

    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the value 1:");
        int a=h.nextInt();
        System.out.println("enter the value 2:");
        int b=h.nextInt();
        add(a,b);
    }
}
