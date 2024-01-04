package java8;

class Sample2{
	Sample2(String s){
		System.out.println("String Argument");
	}
	Sample2(){
		System.out.println("No Argument");
	}
			}
interface Interf4{
	public Sample2 get(String s);
}

 class Test24 {

	public static void main(String[] args) {

		Interf4 i=Sample2::new;
		Sample2 s1=i.get("Amra");
		Sample2 s2=i.get("Saima");
	}

}



