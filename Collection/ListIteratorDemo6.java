package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo6 {

	public static void main(String[] args) {
	LinkedList<Object> l = new LinkedList<Object>();
		l.add("Amra");
		l.add("Sufiya");
		l.add("Saima");
		l.add("Nagma");
	System.out.println(l);//Amra,Sufiya,Saima,Nagma
	ListIterator<Object>itr =l.listIterator();
	while(itr.hasNext()){
	String s=(String)itr.next();
	if(s.equals("Sufiya")) {
	itr.remove();//Amra,Saima,Nagma
	}
	else if(s.equals("Nagma")) {
	itr.add("Rehab");}//Amra,Sufiya,Nagma,Rehab
	else if(s.equals("Saima")) {
		itr.set("Sabiha");//Amra,Sabiha,Nagma,Rehab
		}
	}
	System.out.println(l);//Amra,Sabiha,Nagma,Rehab
	
	}

}
