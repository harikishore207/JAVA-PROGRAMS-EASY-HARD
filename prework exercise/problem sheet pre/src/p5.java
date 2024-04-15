import java.util.Scanner;

public class p5 {

    static  void fun1(int sec){
        sec=sec*60;
        System.out.println("The second is:"+sec);
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the minute:");
        int min=h.nextInt();
        fun1(min);
    }
}
