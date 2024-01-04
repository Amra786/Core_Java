package Oops;
interface Printable{
	void show(); 
		}
	interface Showable extends Printable{
		void display();
		}
	
class Demo implements Showable{
	
	public void show() {
		System.out.println("Hi this is interface");
	}
	public void display() {
	System.out.println("Hi this is extended interface");
	}

	public static void main(String[] args) {
	Demo d1=new Demo();
	d1.show();
	d1.display();
		}
	}