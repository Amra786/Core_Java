package java8;

import java.util.function.Function;

class Test57 {

	public static void main(String[] args) {
			Function<Integer,Integer> f=i->i*i;
			System.out.println("The Square of 40:"+f.apply(40));
			System.out.println("The Square of 50:"+f.apply(50));

	}

}
