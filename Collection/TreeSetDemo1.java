package Collection;

import java.util.*;

class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet<StringBuffer> t=new TreeSet<StringBuffer>();
		
						t.add(new StringBuffer("A"));
						t.add(new StringBuffer("Z"));
						t.add(new StringBuffer("L"));
						t.add(new StringBuffer("B"));
					System.out.println(t);//StringBuffer class does not implement comparable interface//CCE
	}

}
