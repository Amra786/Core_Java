package Oops;

class Parent
{
	public void p() 
	{
	System.out.println("Parent class");
	}
}
 class Child extends Parent
	{
	public void c()
	{
		System.out.println("Child class");
}
	
	public static void main(String[] args) {

		Child c1=new Child();
		c1.p();
		c1.c();
		}
	}

		
	


