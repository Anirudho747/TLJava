package assignment;

public class FindMajority {

    public static void main(String[] args)
    {
        int[] even = new int[]{7,2,7,3,7,7,2,7,1,7};
        int[] odd = new int[]{0,1,1,2,2,3,3,3,3,3,3};
        returnMajority(even,(even.length/2));
        returnMajority(odd,(odd.length/2));
        }
    public static void returnMajority(int[] arr,int magicNumber)
    {
            int cnt,indctr=0;
        for(int i=0;i<arr.length;i++)
        {   cnt=1;
            for(int j=i+1;j<arr.length;j++)
            {       if(arr[i]==arr[j])
                    {   cnt++;   }
                    if (cnt>magicNumber) {
                        System.out.println(arr[i]+" is the majority element");
                        indctr=-1; break;  }
            }
            if(indctr==-1)
            {
                break;
            }}}}
