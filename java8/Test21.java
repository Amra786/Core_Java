package java8;

interface Interf1{
	public void add(int a,int b);
}
 class Test21 {
		 
	 public static void sum(int x,int y) {
		 System.out.println("The Sum:"+(x+y));
	 }
	 public static void  main(String[] args) {
		 Interf1 i=(a,b)->System.out.println("The Sum:"+(a+b));
		 i.add(10,20);
		 
		 Interf1 i1=Test21::sum;
		 i1.add(100,200);
		 
		 

	 }
 }
