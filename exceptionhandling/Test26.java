package exceptionhandling;

import java.io.*;

class Test26 {

	public static void main(String[] args) {
		try {
			//System.out.println(10/0);
	 		String s = null;
			System.out.println(s.length());
			}
		catch (ArithmeticException  | NullPointerException e) {
			System.out.println(e);
				}
			}
	}

