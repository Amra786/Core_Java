package exceptionhandling;

public class Test20 {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.setPriority(10);
		t.setPriority(100);//illegalArgumentException
	}

}
