import java.util.*;
 public class Staircase
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("#");
            }
        System.out.println();

        }
        //System.out.println();
    }
}
