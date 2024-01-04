package Oops;

interface Abc {
	void show(); 
		}
interface xyz {
	void show1();
	}

 class Multiple implements Abc, xyz {
	 
  public void show(){
		 System.out.println("multiple inheritance");
		 }
	 public void show1(){
		System.out.println("interface");}
	 
	public static void main(String[] args) {
		Multiple m1=new Multiple();
		m1.show();
		m1.show1();

	}

}
