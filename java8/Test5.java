package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		System.out.println(l);
		List<Integer>l1= l.stream().map(i-> i*2).collect(Collectors.toList());
		System.out.println(l1);

	}
}



