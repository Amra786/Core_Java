package Collection;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		
		Vector<Object> v=new Vector<Object>();
		System.out.println(v.capacity());
		for(int i=1; i<=10; i++) {
		v.addElement(i);
		}
		System.out.println(v.capacity());
			v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
	}
}
