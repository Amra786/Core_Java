package java8;

class Sample1{
	Sample1(String s){
		System.out.println("Sample class Constructor Execution with argument:"+s);
	}
}
interface Interf3{
	public Sample1 get(String s);
}

 class Test23 {

	public static void main(String[] args) {

		Interf3 i=Sample1::new;
		Sample1 s1=i.get("Amra");
		Sample1 s2=i.get("Saima");
	}

}
