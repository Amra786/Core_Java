package exceptionhandling;

public class Test11 {
	
	static ArithmeticException e;
	public static void main(String[] args) {
			throw e; //NPE
	}

}
