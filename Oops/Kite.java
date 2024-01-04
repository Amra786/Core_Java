package Oops;

interface tops{
	void print();
	}

 class Kite implements tops {
	public void print() {
		System.out.println("Hi this is interface");
	}
	public static void main(String[] args) {
		Kite k=new Kite();
		k.print();

	}

}
