package Oops;

abstract class A3{
	abstract void callme();
	public void show() {
	System.out.println("Hi this is normal method");	
	}
}
 class Blue extends A3{
	void callme() {
	System.out.println("Hi this is abstract method");
	}
	public static void main(String[] args) {
		
		Blue v=new Blue();
			v.show();
			v.callme();
	}
}
