package java8;

import java.util.function.Predicate;

 class Test26 {

	public static void main(String[] args) {
		int[] x= {0,5,10,15,20,25,30};
		Predicate<Integer> p=i->i%2==0;
		for(int x1 : x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}
 }
