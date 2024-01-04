package java8;

interface Interf{
	public void m1();
	}
 class Test {
	 int x = 10;
	 public void m2() {
		int y = 20;
		 Interf i = ()->
		 {
			 x = 888;
			  //y = 999;//CE local variables refrenced from lamda expression must be final or effectively final
			 System.out.println(x);
			 System.out.println(y);
		  };
		  i.m1();
 }
	 public static void main(String[] args) {
		 Test t=new Test();
		 t.m2();
	}
		
	}


