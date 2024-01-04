package Oops;

class Employee 
		{
	float salary=10000;

		}
	class HR extends Employee 
	{
	
	float salary = 20000;{
	}
	
	 void display()
		{
		System.out.println("Salary:  "+super.salary);
		}
	}
	 class Val
	{
		 public static void main(String[] args) {
	
	HR sc = new HR();
		 sc.display();
	}
}

	


