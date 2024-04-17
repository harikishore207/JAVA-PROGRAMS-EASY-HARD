/*Question:. The health visitor at a school is going to measure the heights of all pupils. For each class he makes a
statistics giving the number of pupils of each height and the average height. Make a Java program that
helps the health visitor making the statistics.
Example:
In a class with 20 pupils the heights of the individual pupils, in centimeters, are:
175, 167, 160, 164, 183, 187, 188, 179, 176, 175,
169, 175, 176, 178, 165, 160, 173, 165, 187, 178.
The program should read in all the numbers and make a table like this:
Height Number of pupils
160         2
164         1
165         2
167         1
...         ...
...         ...
188         1
Average Height 174.0

 */


import java.util.Scanner;

public class p3 {
    public static double favg(int[] a)
    {
        int sum = 0;
        for (int i=0;i<a.length;i++) {
            sum += a[i];
        }
        return (double) sum / a.length;
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("enter the number of students:");

        int n= h.nextInt();
        System.out.println("enter the values:");
        int[] clas=new int[n];
        for(int i=0;i<n;i++)
        {
            clas[i]= h.nextInt();
        }
        /*for (int i = 0; i < n; i++) {
            System.out.print(clas[i]);
           if (i < n - 1) {
                System.out.print(", ");
            }
        }*/
        double avg;

        avg=favg(clas);
        int[] heightCount = new int[clas.length];

        // Count the occurrences of each height
        for (int i = 0; i < clas.length; i++) {
            int currentHeight = clas[i];
            int count = 1; // Count for the current height

            // Check if the height has already been counted
            if (heightCount[i] == 0) {
                // Count the occurrences of the current height in the remaining elements
                for (int j = i + 1; j < clas.length; j++) {
                    if (clas[j] == currentHeight) {
                        count++;
                        // Mark the counted height to avoid double counting
                        heightCount[j] = 1;
                    }
                }

                // Display the count for the current height
                System.out.println("Height"+ "\t\t" +"Number of pupils");
                System.out.println(currentHeight + "\t\t\t\t" + count);
            }
        }
        System.out.print("average:"+avg);
    }
}
