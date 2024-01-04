package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}
 class Test50 {


	public static void main(String[] args) {
		Function<Student,String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Dictinction]";
			else if(marks>=60) grade="B[First Class]";
			else if(marks>=50) grade="C[Second Class]";
			else if(marks>=35) grade="E[Third Class]";
			else grade="E[Failed]";
			return grade;
		};
		Predicate<Student> p=s->s.marks>=60;
		Consumer<Student> c=s1->{
			System.out.println("Student name:"+s1.name);
			System.out.println("Student marks:"+s1.marks);
			System.out.println("Student grade:"+f.apply(s1));
			System.out.println();

		};
		Student[] s= {	new Student("Amra",100),
						new Student("Saima",65),
						new Student("sufiya",55),
						new Student("Misbah",45),
						new Student("Muskan",25),
		};
		for(Student s1:s) {
			//if(p.test(s1)) {//100,65
				
			c.accept(s1);//all
			//}
		}
	}

}
