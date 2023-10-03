package w3D1;

import java.util.Scanner;

public class FindFrequency {

    static String sntnc;
    static char chr;
    static int cnt;
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        sntnc = sc.nextLine();
        chr='i';
        chr = sc.next().charAt(0);
        System.out.println(chr+" occurs "+count()+" times");

        System.out.println(chr+" occurs "+3+4+" times"+6+9);
    }

    public static int count()
    {
        char[] abc = sntnc.toCharArray();
        for(int i=0;i<abc.length;i++)
        {if(abc[i]==chr)
            {cnt++;}}
        return cnt;
    }
}
