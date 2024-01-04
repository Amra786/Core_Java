package Oops;

class Person {
	void message() {
		System.out.println("welcome");
	}
}

class Student extends Person
	{
	void message() {
	System.out.println("super at method level");
	}

	void display() {
		
		message();
		super.message();
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		}
	}
