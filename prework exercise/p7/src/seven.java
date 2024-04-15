import java.util.Scanner;

public class seven {
    static void equal(int a,int b){
        System.out.println(a==b);
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the value 1:");
        int a=h.nextInt();
        System.out.println("enter the value 2:");
        int b=h.nextInt();
        equal(a,b);
    }
}

