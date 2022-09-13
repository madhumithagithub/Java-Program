/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
		//Vector v=new Vector();
		//Vector v = new  Vector(25);
		Vector v = new Vector(10,1);
		System.out.println(v.capacity());
		for(int i=0;i<10;i++)
		{
		    v.addElement(i);
		}
		System.out.println(v.capacity());
 		v.addElement('M');
	System.out.println(v.capacity());
 		System.out.println(v);
 	}
}

