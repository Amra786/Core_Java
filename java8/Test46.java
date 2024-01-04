package java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employeee{
	String name;
	double salary;
	Employeee(String name,double salary){
		this.name=name;
		this.salary=salary;
		}
	}
class Test46 {

	public static void main(String[] args) {
		ArrayList<Employeee> l=new ArrayList<Employeee>();
		l.add(new Employeee ("Amra",1000));
		l.add(new Employeee ("Anam",2000));
		l.add(new Employeee ("Alima",3000));
		l.add(new Employeee ("Arifa",4000));
		l.add(new Employeee ("Asma",5000));
		l.add(new Employeee ("Arshima",6000));
		
		Predicate<Employeee> p = e ->e.salary > 5000;	// & 10 conditions;
		
		for(Employeee e1 : l) {
			if(p.test(e1))
			{
			System.out.println(e1.name+":"+e1.salary);
			}
		}
	}
}

