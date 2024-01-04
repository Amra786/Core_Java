package java8;

class Employeer{
			String name;
			int eno;
			Employeer(String name,int eno){
				this.name=name;
				this.eno=eno;  
			}
			public String toString() {
				return name+":"+eno;
				
			}
}
 class Test51 {

	public static void main(String[] args) {
		Employeer e= new Employeer("Amra",100);
		System.out.println(e);
	}

}
