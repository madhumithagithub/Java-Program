import java.util.*;
public class MinMaxSum {
    public static void main(String[] args) {
         long sum=0;
         int i;
        Scanner s=new Scanner(System.in);
        long[] arr=new long[5];
        for( i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
         }
        long large=arr[0];
         for(i=1;i<5;i++)
         {
            if(arr[i]>large)
            {
                large=arr[i];
            }
         }
         long small=arr[0];
         for(i=1;i<5;i++)
         {
            if(arr[i]<small)
            {
                small=arr[i];
            }
         }
         for( i=0;i<5;i++)
        {
             sum+=arr[i];
             }
       
        long min=sum-large;
        long max=sum-small;
           System.out.println(Math.abs(min)+" "+max); 
            
        
        }
}
