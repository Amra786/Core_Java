package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employeej{
			String name;
			int eno;
			Employeej(String name,int eno){
				this.name=name;
				this.eno=eno;  
			}
			public String toString() {
				return eno+":"+name;
				
			}
}
 class Test53 {

	public static void main(String[] args) {
		ArrayList<Employeej> l=new ArrayList<Employeej>();
		l.add(new Employeej("Amra",872425));
		l.add(new Employeej("Arifa",235645));
		l.add(new Employeej("Arfa",563424));
		l.add(new Employeej("Ashifa",846373));
		l.add(new Employeej("Arshima",487653));
		System.out.println(l);
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);//acc to name

 	}

}






