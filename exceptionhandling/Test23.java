package exceptionhandling;

import java.util.*;

 class Test23 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		System.out.println(l);
	  	Iterator itr = l.iterator();
		while(itr.hasNext()) {
			//Object obj = itr.next();
			itr.remove();//illegalstateException
			}
			System.out.println(l);

		}
	}


