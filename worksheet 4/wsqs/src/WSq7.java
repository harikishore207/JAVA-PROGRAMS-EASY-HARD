import java.util.Arrays;
import java.util.Scanner;

public class WSq7 {
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the string:");
        String s1= h.nextLine();
        System.out.println("enter the string: of anagram:");
        String s2= h.nextLine();
        String s3=s1.replace(" ","");
        String s4=s2.replace(" ","");
        //System.out.println(s3+"  "+s4);
        if(s3.length()==s4.length())
        {
            checkana(s3,s4);
        }
        else{
            System.out.println("not an anagram!");
        }
    }
    public static int checkana(String s1,String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        //  System.out.println(Arrays.toString((c1)));
        // System.out.println(Arrays.toString((c2)));
        boolean isequal=Arrays.equals(c1,c2);
        if(isequal)
        {
            System.out.println("its anagram...");
        }
        else {
            System.out.println("not a anagram...");
        }
        return 0;
    }
}
