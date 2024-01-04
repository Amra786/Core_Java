package Collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args)
	{
		
		ArrayList<Object> l=new ArrayList<Object>();
			l.add("A");
			l.add(10);
			l.add("A");
			l.add(null);
			System.out.println(l);
			l.remove(2);
			System.out.println(l);
			l.add(2, "M");
			l.add("N");
			l.add("Imran");
			System.out.println(l);
		}
	}


