package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employeeh{
			String name;
			int eno;
			Employeeh(String name,int eno){
				this.name=name;
				this.eno=eno;  
			}
			public String toString() {
				return eno+":"+name;
				
			}
}
 class Test52 {

	public static void main(String[] args) {
		ArrayList<Employeeh> l=new ArrayList<Employeeh>();
		l.add(new Employeeh("Amra",872425));
		l.add(new Employeeh("Arifa",235645));
		l.add(new Employeeh("Arfa",563424));
		l.add(new Employeeh("Ashifa",846373));
		l.add(new Employeeh("Arshima",487653));
		System.out.println(l);
		Collections.sort(l,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println(l);//acc to number

 	}

}



