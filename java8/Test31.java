package java8;

import java.util.function.Function;

 class Test31 {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(5));
	}

}
