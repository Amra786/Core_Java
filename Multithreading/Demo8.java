package Multithreading;

class Display {
	
public synchronized void wish(String name) {
	for(int i=0; i<10; i++) {
	System.out.println("good morning");
	try {
		Thread.sleep(1);}
	catch(InterruptedException e){}
	System.out.println(name);
	}
}
}
 class MT extends Thread{
  Display d;
  String name;
  MT(Display d,String name){
	  this.d= d;
	  this.name=name;
}  
	  public void run(){
		  d.wish(name);
	  }
  }
 
 
 public class Demo8{
	 public static void main(String[] args) {
		Display d = new Display();
		MT t1 = new MT(d,"AMRA");
		t1.start();
		MT t2 = new MT(d,"Bano");
		t2.start();
	}
 }
 
 

  


