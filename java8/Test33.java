package java8;

import java.util.function.IntUnaryOperator;

 class Test33 {

	public static void main(String[] args) {
		IntUnaryOperator f=i->i*i;
		System.out.println(f.applyAsInt(6));
		}
	}
