package MultipleInheritance
public class Parent {
	void add()
	{
		int a=10,b=20,c=a+b;
		System.out.println(c);
	}

}
public class child extends Parent {
	void sub()
	{
		int a= 30,b=20,c=a-b;
		System.out.println(c);
	}

}
public class child2 extends child{
	void mul()
	{
		int a=10,b=20,c=a*b;
		System.out.println(c);
	}

}

public class Test {

	public static void main(String[] args) {
		child2 c2 = new child2();
		c2.add();
		c2.sub();
		c2.mul();

	}

}

