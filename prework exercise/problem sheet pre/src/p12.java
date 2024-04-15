import java.util.Scanner;

public class p12 {
    public static int ret(int[] a) {
        return a[0];
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n= h.nextInt();
        System.out.println("enter the array :");
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]= h.nextInt();
        }
        System.out.println(ret(array));
    }

}
