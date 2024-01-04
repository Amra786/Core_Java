package java8;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employees{
	String name;
	double salary;
	Employees(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
}
 class Test43 {

	public static void main(String[] args) {
		ArrayList<Employees> l=new ArrayList<Employees>();
		populate(l);
		BiConsumer<Employees,Double> 
		c=(e,d)->e.salary=e.salary+d;
		for(Employees e:l) {
			c.accept(e, 500.0);
		}
		for(Employees e:l) {
			System.out.println("Employees Name:"+e.name);
			System.out.println("Employees Salary:"+e.salary);
			System.out.println();

		}
	}
	public static void populate(ArrayList<Employees> l) {
		l.add(new Employees("Amra",1000));
		l.add(new Employees("Saima",2000));
		l.add(new Employees("Sufiya",3000));
		l.add(new Employees("Nagma",4000));
		}
 }
 
