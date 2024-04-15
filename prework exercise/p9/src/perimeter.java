import java.util.Scanner;

public class perimeter {
    static void p(int a,int b){
        int c=2*(a+b);
        System.out.println("perimeter is :"+c);

    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the length:");
        int a=h.nextInt();
        System.out.println("enter the width:");
        int b=h.nextInt();
        p(a,b);
    }
}

