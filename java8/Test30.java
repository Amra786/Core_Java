package java8;

import java.util.function.IntToDoubleFunction;

 class Test30 {

	public static void main(String[] args) {
		IntToDoubleFunction f=i->Math.sqrt(i);
		System.out.println(f.applyAsDouble(9));
	}

}
