package java8;

import java.util.function.*;

class Test37 {

	public static void main(String[] args) {
		IntUnaryOperator f=i->i+1;
	System.out.println(f.applyAsInt(4));
	
	IntUnaryOperator f1=i->i*i;
	System.out.println(f1.applyAsInt(4));
	
	System.out.println(f.andThen(f1).applyAsInt(4));//o/p5,16,25
		}
	}
