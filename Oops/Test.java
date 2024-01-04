package Oops;

abstract class vehicle 
{
	 public abstract int getNoOfWheels(); 
	} 
  class Bus extends vehicle
	 {
	public int getNoOfWheels()
	{
		return 6;
		}
	}
  class Auto extends vehicle
  {
	@Override
	public int getNoOfWheels() {

		return 3;
	} 
}
 class Test{
	public static void main(String[] args) {
		Bus b = new Bus();
		System.out.println(b.getNoOfWheels());
		
		Auto a = new Auto();
		System.out.println(a.getNoOfWheels());
	}
	 }
 
	
	

