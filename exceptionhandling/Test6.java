package exceptionhandling;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("stmt-1");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(10/2);
			}
		System.out.println("stmt-3");
		}
	}
