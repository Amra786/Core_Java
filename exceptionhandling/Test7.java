package exceptionhandling;

public class Test7 {

	public static void main(String[] args) {
		try {
			System.out.println("try");
		return;
		}
		catch(NullPointerException e) {
			System.out.println("catch");
			}
		finally {
			System.out.println("finally");
			}
		}
	}


