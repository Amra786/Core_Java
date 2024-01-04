package Multithreading;

class MyThread5 extends Thread{
	
	public void run() {
	 for(int i=0; i<10; i++){
	   System.out.println("child thread");
	
	 try {
		  Thread.sleep(2000);
		  }
	catch(InterruptedException e) {}
		}
	}
}
public class Demo5  
{
	public static void main()throws	InterruptedException
	{
		MyThread5 t=new MyThread5();
		t.start();
		t.join(10000);
		
	for(int i=0; i<10; i++){
	System.out.println("main method");
	}
  }
}	



