package java8;

 class Test20 {
	 
	 public void  m1() {
		 for(int i =0; i<10;i++) {
			System.out.println("Child Thread-1");  
		 }
	 }

	public static void main(String[] args) {
		Test20 t1= new Test20();
		Runnable r= t1::m1;  //methodRefernce
		Thread t=new Thread(r);
		t.start();
		for(int i =0; i<10;i++) {
			System.out.println("Main Thread-1");  
			}
		}
 }
