import java.util.Scanner;

public class WSq6 {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter your and father name:");
        String s = h.nextLine();
        String[] myn=s.split(" ");
        char f=myn[1].charAt(0);

        System.out.println("name:"+ myn[0] +" "+f);
    }
}
