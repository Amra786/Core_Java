package java8;

import java.util.function.Predicate;

class Test45 {

	public static void main(String[] args) {
		String[] s = {"Amra","Anam","Saima","Sufiya","Rihab","Alima"};
		Predicate<String> p=s1->s1.length()%2==0;
		for(String s1:s) {
			if(p.test(s1)) {
				System.out.println(s1);
				}
			}
		}
	}
