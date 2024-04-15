import java.util.Scanner;

public class ele {
    public static int add(int a){
        return a+1;
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the value:");
        int val= h.nextInt();
        int in= add(val);
        System.out.println("output:"+in);
    }
}
