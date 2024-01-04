package exceptionhandling;

public class Test22 {

	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
		t.start();//IllegalThreadStateException
	}

}
