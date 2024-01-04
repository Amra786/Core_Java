package Multithreading;

class MyThread7 extends Thread {
	public void run() {
	for(int i=0; i<10; i++) {
	System.out.println("I am lazy");
	System.out.println("I am entering into sleep state");
		try {
			Thread.sleep(2000);}
			catch (InterruptedException e) {
			System.out.println(" I got interrupted");
			}
		}
	}
}

public class Demo7 {

	public static void main(String[] args) {
		MyThread7 t=new MyThread7();
		t.start();
		//t.interrupt();
		System.out.println("main method");
		}

	}
