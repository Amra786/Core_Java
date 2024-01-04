package Collection;

import java.util.*;

class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
						t.add(10);
						t.add(0);
						t.add(5);
						t.add(15);
						t.add(20);
						t.add(20);
		System.out.println(t);
	}

	static class MyComparator implements Comparator<Integer>{
		public int compare(Integer obj1,Integer obj2) {
			if (obj1<obj2) {
				return 1;
				
			}else if (obj1>obj2) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}
