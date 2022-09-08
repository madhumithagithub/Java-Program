/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		String s="Program";
		int i,j;
	   char a[]=s.toCharArray();
		for( i=0;i<a.length;i++)
		{
		    for(j=0;j<a.length;j++)
		    {
		        if(i==j||i+j==a.length-1)
		            System.out.print(a[j]);
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
		
	}
}

