import java.util.Scanner;

public class agetodays {
    public static int con(int a){
        a=a*365;
        return a;
    }
    public static void main(String[] args) {
    Scanner h=new Scanner(System.in);
    System.out.println("enter the age:");
    int age= h.nextInt();
    int days=con(age);
        System.out.println("Days:"+days);
    }
}
