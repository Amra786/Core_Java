package Multithreading;

class MyThread2 extends Thread{}

public class Demo2 {

	public static void main(String[] args) 
	{

		System.out.println(Thread.currentThread().getPriority()); //5

		Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority()); //1
		}
	}
	

			
	
		
