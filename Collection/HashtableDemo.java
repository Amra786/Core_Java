package Collection;

import java.util.*;

class HashtableDemo {

	public static void main(String[] args) {
		Hashtable h  =  new Hashtable();
		h.put (new  Temp1 (5),"A");
		h.put (new  Temp1 (2),"B");
		h.put (new  Temp1 (6),"C");
		h.put (new  Temp1 (15),"D");
		h.put (new  Temp1 (23),"E");
		h.put (new  Temp1 (16),"F");
		//h.put("Durga",null);//NPE
		System.out.println(h);
		}
	}
class Temp1{
	int i;
		Temp1(int i){
			this.i = i;
		}
		public int Hashcode() {
				return i;
		}
		public String toString() {
			return i  +"";
		}
	}
