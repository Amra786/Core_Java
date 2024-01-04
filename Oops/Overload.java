package Oops;

public class Overload {
	int ans;
	void sum(int a,int b) {
	ans=a+b;
	System.out.println("addition is:"+ans);
	}
	void sum(int a, int b, int c ) {
		ans=a+b+c;
		System.out.println("addition is:"+ans);
		}
	void sum(int a, int b, int c, int d) {
		ans=a+b+c+d;
		System.out.println("addition is:"+ans);
	}
	public static void main(String[] args) {
		Overload a1=new Overload();
		a1.sum(10,2);
		a1.sum(10,2,3);
		a1.sum(10,2,3,4);
		}
	}

