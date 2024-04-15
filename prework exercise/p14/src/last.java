import java.util.Scanner;

public class last {
    public static int ret(int a,int b) {
        return (a+b)-1;
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the two sides:");
        int n1= h.nextInt();
        int n2= h.nextInt();
        System.out.println(ret(n1,n2));
    }

}

