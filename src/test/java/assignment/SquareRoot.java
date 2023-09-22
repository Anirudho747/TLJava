package assignment;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Square root of "+num+" is "+getRoot(num));
    }
    public static int getRoot(int number)
    {
        int sqrRoot=0;
        for(int i=1;i<number/2;i++)
        {
            if(i*i==number)
            {
                sqrRoot = i;
                break;
            }
            else if((i*i)>number)
            {
                sqrRoot = i-1;
                break;
            }
        }

        return sqrRoot;
    }
}
