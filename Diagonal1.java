//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//For example, the square matrix  is shown below:
//
//1 2 3
//4 5 6
//9 8 9  
//The left-to-right diagonal = 1+5+9=15. The right to left diagonal =3+5+9=17 . Their absolute difference is|15-17|=2 .
//
//Function description
//
//Complete the  function in the editor below.
//
//diagonalDifference takes the following parameter:
//
//int arr[n][m]: an array of integers
//Return
//
//int: the absolute diagonal difference
//Input Format
//
//The first line contains a single integer, , the number of rows and columns in the square matrix .
//Each of the next  lines describes a row, , and consists of  space-separated integers .
//
//Constraints
//
//Output Format
//
//Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
//
//Sample Input
//
//3
//11 2 4
//4 5 6
//10 8 -12
//Sample Output
//
//15
//Explanation
//
//The primary diagonal is:
//
//11
//   5
//     -12
//Sum across the primary diagonal: 11 + 5 - 12 = 4
//
//The secondary diagonal is:
//
//     4
//   5
//10
//Sum across the secondary diagonal: 4 + 5 + 10 = 19
//Difference: |4 - 19| = 15
//
//Note: |x| is the absolute value of x
//

package Diagonal1;
import java.util.*;
public class DiagonalDifference {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=n;
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        int diff;
        int c=0,d=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;i++)
            {
               if(i==j) 
                 c+= a[i][j];  
               if((i+j)==(n-1))
                   d+=a[i][j];
            }
        }
         diff =c-d;
        System.out.println(Math.abs(diff));
    }
}
