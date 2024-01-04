package Oops;

class A2
{
	void show()
	{
	System.out.println("Class a");
		}
}
class B1 extends A2
{
	void display() 
	{
	System.out.println("Class b");
	}
}
class C extends A2
{
	void output() 
	{
	System.out.println("Class c");
		}
}
public class Test3 {

	public static void main(String[] args) {
		A2 a=new A2();
		a.show();
		B1 b=new B1();
		b.show();
		b.display();
		C c=new C();
		c.show();
		c.output();
		
		
		

	}

}
