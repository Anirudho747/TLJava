package w1d2;

import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args)
    {
        int[] arr={10,12,19,10,23,54,19,16,45,67,23};
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println(arr[i]+" is a duplicate number");
            }
        }
    }
}
