package java8;

import java.util.function.UnaryOperator;

class Test32 {

	public static void main(String[] args) {
	UnaryOperator<Integer> f=i->i*i;
	System.out.println(f.apply(6));
	}

}
