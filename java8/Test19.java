package java8;

 class Test19 {
	 
	 public static void m1() {
		 for(int i =0; i<10;i++) {
			System.out.println("Child Thread-1");  
		 }
	 }

	public static void main(String[] args) {
		Runnable r= Test19::m1;  //methodRefernce
		Thread t=new Thread(r);
		t.start();
		for(int i =0; i<10;i++) {
			System.out.println("Main Thread-1");  
			}
		}
	}


