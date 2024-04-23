import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=h.nextInt();
        h.nextLine();
        System.out.println("enter the name:");
        String name=h.nextLine();
        System.out.println("number:"+n);
        System.out.println("name:"+name);

    }
}
