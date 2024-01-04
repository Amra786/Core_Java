package exceptionhandling;

 class Test10 {//Nested try catch

	public static void main(String[] args) {
		try {
			System.out.println("outer try");
			try {
				System.out.println("inner try");
				System.out.println(10/0);
				}
			catch (ArithmeticException e) {
				System.out.println("inner catch block");
				}
		System.out.println("After inner try-catch ");
		}
		catch (Exception e) {
			System.out.println("outer catch");
			}
		finally {
			System.out.println("outer finally");
			}
		}
	}
