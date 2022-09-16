package Inheritance2;

public class Parent {
	void Mul()
	{
		int a=10,b=20,c=a*b;
		System.out.println(c);
	}

}

public class child extends Parent{
	void Sub()
	{   
		int a=30, b=20,c=a-b;
		System.out.println(c);
	}

}

public class TEST {

	public static void main(String[] args) {
		child c1 = new child();
		c1.Mul();
		c1.Sub();

	}

}
