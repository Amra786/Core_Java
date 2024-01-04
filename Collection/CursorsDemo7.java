package Collection;

import java.util.*;

public class CursorsDemo7 {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<Object>();
		Enumeration<Object> e = v.elements();
		Iterator<Object>itr = v.iterator();
		ListIterator<Object> litr = v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}
}
