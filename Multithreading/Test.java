package Multithreading;

class MyMethod extends Thread {
	
	public void start() {
		System.out.println("start method");
		}
		public void run() {
			
		}
	
	}

public class Test
{
	public static void main(String[] args)
	{
	MyMethod t=new MyMethod();
		t.start();
		System.out.println("main method");
	}
	
}

	

















		

	


