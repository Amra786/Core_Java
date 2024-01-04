package Multithreading;

class MyThread3 extends Thread
{ 
	 public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("child thread");
				
			}
		}
	}
	
public class Demo3 {

	public static void main(String[] args) {
		
		MyThread3 t=new MyThread3();
		
		t.setPriority(10);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("mainthread");
		}
	}
}
