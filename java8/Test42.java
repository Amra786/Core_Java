package java8;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee{
	int eno;
	String name;
	Employee(int eno,String name){
		this.eno=eno;
		this.name=name;
	}
}

 class Test42 {

	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		BiFunction<Integer,String,Employee> f=(eno,name)->new Employee(eno,name);
		l.add(f.apply(100,"Amra"));
		l.add(f.apply(200,"Saima"));
		l.add(f.apply(300,"Sufiya"));
		l.add(f.apply(400,"Nagma"));
		for(Employee e: l) {
			System.out.println("Employee Number:"+e.eno);
			System.out.println("Employee Name:"+e.name);
			System.out.println();

		}
	}
 }
