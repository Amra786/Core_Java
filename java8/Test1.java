package java8;

interface Left{
	default void m1() {
		System.out.println("Left Default Method");
	}
}
interface Right{
	default void m1() {
		System.out.println("Right Default Method");
	}
}

 class Test1 implements Left,Right {

		public void m1() { 
			//System.out.println("My Own Implementation");
			//Left.super.m1();
			Right.super.m1();
		} 
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		t.m1();
		}
 }
