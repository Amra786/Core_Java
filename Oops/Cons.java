package Oops;

class Employee1
	{
	Employee1(){
	System.out.println("Employee class constructor");
		}		
	}

class HR1 extends Employee1 {
	HR1(){
		super();
		System.out.println("Super at constructor level");
		}
	}

 class Cons {

	public static void main(String[] args) {
		HR1 r=new HR1();
		}
 	}
