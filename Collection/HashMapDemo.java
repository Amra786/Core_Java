package Collection;

import java.util.*;

 class HashMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
			m.put("Farheen",700);
			m.put("Misbah",800);
			m.put("Muskaan",200);
			m.put("Faham",500);
	System.out.println(m);
    m.put("Farheen",1000);
	Set s = m.keySet();
	System.out.println(s);
	Collection c = m.values();
	System.out.println(c);
	Set s1 = m.entrySet();
	System.out.println(s1);
	Iterator itr = s1.iterator();
	while(itr.hasNext()) {
	Map.Entry m1 = (Map.Entry)itr.next();
	System.out.println(m1.getKey()+"......."+m1.getValue());
	if(m1.getKey().equals("Faham")) {
		m1.setValue(10000);
	}
		}
	System.out.println(m);
	}
		}

	
