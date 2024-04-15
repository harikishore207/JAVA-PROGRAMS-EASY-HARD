import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        System.out.println("enter the weight in Kgs:");
        float weight = h.nextFloat();
        System.out.println("enter the Height in meters:");
        float height = h.nextFloat();
        System.out.println("enter the gender(m/f):");
        String gender = h.next();
        float bmiv = weight / (height * height);
        if (bmiv >= 2.78 && gender.equals("m") || bmiv >= 2.5 && gender.equals("f")) {
            System.out.println("you are over weight");
        } else {
            System.out.println("bmi value is :" + bmiv);
        }
    }
}
