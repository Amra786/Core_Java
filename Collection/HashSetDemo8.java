package Collection;

import java.util.*;

 class HashSetDemo8 {

	public static void main(String[] args) {
		
	HashSet<Object> h = new HashSet<Object>();
					h.add("B");
					h.add("C");
					h.add("D");
					h.add("Z");
					h.add(null);
					h.add(10);
					
	System.out.println(h.add("Z"));//false
	System.out.println(h);
		}

}
