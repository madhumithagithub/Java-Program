/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class NestedIf
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    System.out.println("enter the first number:");
	    int num1=s.nextInt();
	    System.out.println("enter the second number:");
	    int num2=s.nextInt();
	    if(num1==50)
	    {
	        if(num2==60)
	        System.out.println("The number is equal");
	    }
	    else
	    {
	        System.out.println("The number is  not equal");
	    }
	}
		
}
