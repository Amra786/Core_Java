package Oops;

class A { 
	private void m1() 
	{
		System.out.println("A class private Method");
		}
	public void callm1() {
		m1();
		}
}
public class Test1
{
	public static void main(String[] args)
	{
		A a = new A();
		a.callm1();
		}
	}
