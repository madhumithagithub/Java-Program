package MethodOverloading1;

public class Class1 {
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
     void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.sum(1,2);
		c1.sum(1,2,3);

	}

}
