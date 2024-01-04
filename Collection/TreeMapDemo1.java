package Collection;

import java.util.*;

class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<String, Integer> (new MyComparator4 ());
		t.put("XXX",10);
		t.put("AAA",20);
		t.put("ZZZ",30);
		t.put("LLL",40);
		System.out.println(t);
	
	}
}
class MyComparator4 implements Comparator<String>{
	public int compare(String s1, String s2){
		return s2.compareTo(s1);
	}
}
