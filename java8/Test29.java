package java8;

import java.util.function.Function;

 class Test29 {

	public static void main(String[] args) {
		Function <Integer,Double> f=i->Math.sqrt(i);
		System.out.println(f.apply(7));
		}
	}
