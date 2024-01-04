package Oops;

class Pupil{
	
	int rollno;
	String name;
	static String college = "Integral";
	
	static void change() {
	    college="Kramat";
    	}

Pupil(int r, String n){

	rollno=r;
	name=n;
}

	void display() {
		System.out.println(rollno+"  "+name+"  "+college);
	}
	
	public static void main(String[] args)
	{
	
	Pupil.change();
	Pupil p1=new Pupil(1,"Amra");
	Pupil p2=new Pupil(2,"Sufiya");
	Pupil p3=new Pupil(3,"Saima");
	p1.display();
	p2.display();
	p3.display();
	}
}
