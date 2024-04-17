/* Doctor says a man should weigh 106 pounds for the first 5 feet of height, plus 7 pounds for every inch
above that; a woman should weigh 100 pounds for the first 5 feet of height, plus 6 pounds for every inch
above that. Write a program that determines how much an individual person should weigh. Here’s what
your program might look like in action:
Sample Output:
Type 1 if you are female and 2 if male: How tall are you?
Number of feet : 5
Number of inches : 10
You should weigh 160 pounds
Type 1 if you are female and 2 if male: How tall are you?
Number of feet : 6
Number of inches : 0
You should weigh 190 pounds*/

import java.util.Scanner;

public class p4 {
    public static int  calculatepound(int g,int f,int i)
    {
        int weight=0;
        if(g==1)
        {
            weight = 100 + (f - 5) * 12 * 6 + i * 6;
        } else if (g==2) {
            weight = 106 + (f - 5) * 12 * 7 + i * 7;
        }
        else
        {
            System.out.println("invalid Gender!");
        }
        return weight;
    }
    public static void main(String[] args) {
        Scanner h=new Scanner(System.in);
        System.out.println("Type 1 if you are female and 2 if male: How tall are you?");
        int gender= h.nextInt();
        System.out.println("enter the number of feet:");
        int feet= h.nextInt();
        System.out.println("enter the number of inches:");
        int inches= h.nextInt();
        int w=calculatepound(gender,feet,inches);
        System.out.println("you have to be weighted:"+w);
    }
}
