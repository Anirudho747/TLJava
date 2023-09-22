package assignment;

import java.lang.reflect.Array;
import java.util.Scanner;
public class HappyNumber {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkHappy(number);
    }

    public static void checkHappy(int n)
    {
        int[] a = new int [10];
        int r;
        int i=0;
        for(int k=0;k<20;k++) {
            while (n >= 1) {
                r = (n % 10);
                a[i] = r * r;
                n = n / 10;
                i++;
            }
            n=0;i=0;
            for(int j=0;j<a.length;j++)
            {
                n=n+a[j];
                a[j]=0;
            }
        }
        if(n==1)
        {
            System.out.println("This is a happy Number");
        }
        else
        {
            System.out.println("Not a happy Number");
        }
    }
}
