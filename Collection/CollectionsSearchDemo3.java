package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo3 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
	System.out.println(Collections.binarySearch(l,"Z"));//3
	System.out.println(Collections.binarySearch(l,"J"));//-2
		}
	}
