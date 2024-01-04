package Collection;

import java.util.*;

public class LinkedHashSetDemo9 {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> h = new LinkedHashSet<Object>();
							h.add("B");
							h.add("c");
							h.add("D");
							h.add("Z");
							h.add(null);
							h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);
		}
	}
