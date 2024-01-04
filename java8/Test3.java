package java8;

import java.util.function.Supplier;

public class Test3 {

	public static void main(String[] args) {
		Supplier<String> s=()->{
			String[] s1 = {"sunny","bunny","chinny","pinny"};
			int x = (int)(Math.random()*3+1);		

			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
