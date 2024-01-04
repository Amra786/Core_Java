package Multithreading;

class MyThread1 extends Thread{

}

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread1 t=new MyThread1();
		
		System.out.println(t.getName());
		
		Thread.currentThread().setName("main thread name changed");
		
		System.out.println(Thread.currentThread().getName());
		}
	}
