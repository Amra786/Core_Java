package Multithreading;

class Method extends Thread{
	
	public void run(){
		System.out.println("no arg run");
		}
	public void run(String i){
		System.out.println("int arg run");
		System.out.println(i);
		}
}

public class Details  {
	
	public static void main(String[] args) {
		
		Method t=new Method();
				t.start();
				t.run("amra");
		}
	}
	

	


