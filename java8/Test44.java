package java8;

import java.util.Scanner;

interface Interf5{
	public static void m1() {
		System.out.println("Interface static method");
	}
}

public class Test44 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		System.out.println("Enter Third Number");
		int c=sc.nextInt();
		int max=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println("Max Value"+max);
		}
	}
