package java8;

import java.util.function.BinaryOperator;

 class Test35 {

	public static void main(String[] args) {
		BinaryOperator<Integer> b=(i1,i2)->i1*i2;
		System.out.println(b.apply(10,20));
		}
	}
