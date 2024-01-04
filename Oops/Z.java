package Oops;

class X
{
	public void show()
	{
	System.out.println("Class x Method");
		}
	}
class Y extends X
{
public void display()
{
	System.out.println("Class y Method");
		}
	}
public class Z extends Y 
{
	public void output()
	{
		
		System.out.println("Class z Method");
		}

	public static void main(String[] args) 
	{
	Z a1=new Z();
	  a1.show();
	  a1.display();
	  a1.output();
	}
}
	
