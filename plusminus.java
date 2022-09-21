Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Example

There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

0.400000
0.400000
0.200000
Function Description

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

int arr[n]: an array of integers
Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with  digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer, , the size of the array.
The second line contains  space-separated integers that describe .

Constraints



Output Format

Print the following  lines, each to  decimals:

proportion of positive values
proportion of negative values
proportion of zeros
Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array.
import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    int n =s.nextInt();
    int arr[]= new int[n];
    double positive=0,negative=0,zero=0;
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]>0)
           positive++; 
        else if(arr[i]<0)
            negative++;
        else
           zero++;
    }
    double a,b,c;
    a=positive/n;
    b=negative/n;
    c=zero/n;
    System.out.printf("%.6f \n",a);
    System.out.printf("%.6f \n",b);
    System.out.printf("%.6f",c);
}
}
    





The proportions of occurrence are positive: , negative:  and zeros: 