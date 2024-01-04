package java8;

import java.util.function.BiFunction;

class Test34 {

	public static void main(String[] args) {
		BiFunction<String,String,String> f=(s1,s2)->s1+s2;
		System.out.println(f.apply("durga","software"));
		}
	}
