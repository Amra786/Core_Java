 package Oops;

class A1
{
		protected void m1() {
		System.out.println("A class protected Method");
		}
}
	class B extends A1{
	
	public static void main(String[] args)
	{
	A1 a = new A1();
	a.m1();
	
	B b=new B();
	b.m1();
	
	A1 a1=new B();
	a1.m1();
			}
			}


