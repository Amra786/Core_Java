

package Collection;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args)
		{
		
		LinkedList<Object> l=new LinkedList<Object>();
		l.add("Amra");
		l.add(30);
		l.add(null);
		l.add("Amra");//[Amra,30,null,Amra]
		l.set(0,"software");//[software, 30,null,Amra]
		l.add(0,"sammo");//[sammo,software,30,null,Amra]
		l.removeLast();//[sammo, software,30,null]
		l.addFirst("CCC");//[CCC,sammo,software,30,null]
		System.out.print(l);//[CCC,sammo,software,30,null]

	}

}
