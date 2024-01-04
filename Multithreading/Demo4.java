package Multithreading;

class MyThread4 extends Thread
{
	public void run() {
	for(int i=0; i<10; i++) {
	System.out.println("child thread");
    Thread.yield();
		}
	}
}

public class Demo4 {
	public static void main(String[] args) {
		
	MyThread4 t=new MyThread4();
		t.start();
		for(int i=0; i<10; i++) {
		System.out.println("main thread");
		}
	}
}
