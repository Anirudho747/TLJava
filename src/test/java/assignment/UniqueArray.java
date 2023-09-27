package assignment;

import java.util.Scanner;

public class UniqueArray {

    static int[] arr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++) {  arr[i] = sc.nextInt();  }
        checkUnique();
    }
    public static void checkUnique()
    {
        int chkr=0;
        for(int i=0;i<arr.length;i++)
        {       for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j])
                {   chkr++;
                    break;
                }                               }
        }
        if (chkr>0) {       System.out.println("true,it has duplicate");    }
        else        {       System.out.println("False, no duplicates");     }
    }
}
