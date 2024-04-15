import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the val1:");
        double v1= h.nextDouble();
        System.out.println("enter the val2:");
        double v2= h.nextDouble();
        if(v1>=0 && v1<=1 && v2>=0 && v2<=1 )
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }

}
