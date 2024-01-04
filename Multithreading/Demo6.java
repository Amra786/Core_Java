package Multithreading;

class MyThread6 extends Thread {
	public void run() {
		try {
	for(int i=0; i<10; i++) {
	System.out.println("i am lazy thread");
	Thread.sleep(2000);}}
	catch(InterruptedException e) {
	System.out.println("i got interrupt");
			}
		}	
	}
public class Demo6 {

	public static void main(String[] args) {
		MyThread6 t=new MyThread6();
		t.start();
		t.interrupt();
		System.out.println("end of main");
			}
		}

