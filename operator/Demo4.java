package operator;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any no you want to sum ");
		int n=sc.nextInt();
		while (n>0) {
			sum=sum+n;
			n--;
		}
		System.out.println("sum:"+sum);
		}
	}



