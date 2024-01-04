package java8;

class Sample{
	
	Sample(){
	System.out.println("Sample class Constructor Execution....");
	}
	}

interface Interf2{
	public Sample get();
}

 class Test22 {
		
	public static void main(String[] args) {
		Interf2 i=Sample::new;
		Sample s1=i.get();
		Sample s2=i.get();
		Sample s3=i.get();
		Sample s4=i.get();
		}
	}


