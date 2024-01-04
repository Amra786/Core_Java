package Collection;

import java.util.*;

class TreeSetDemo4 {

	public static void main(String[] args) {
		
	TreeSet<Object> t = new TreeSet<Object>(new MyComparator1());
					t.add(new StringBuffer("A"));
					t.add(new StringBuffer("Z"));
					t.add(new StringBuffer("K"));
					t.add(new StringBuffer("L"));
					System.out.println(t);
		}
	}
class MyComparator1 implements Comparator<Object>{

	public int compare(Object obj1,Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s1.compareTo(s2);
			}
	}
