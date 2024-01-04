package Oops;

class Operation {
	int square(int n) {
		return n*n;
	}
}
public class Circle {
	Operation op;
	double pi=3.14;
	double area(int radius) {
		op = new Operation();
	int r_square=op.square(radius);
	return pi*r_square;
	}
	public static void main(String[] args) {
	Circle c=new Circle();
	double result= c.area(5);
	System.out.println(result);
	}
}

