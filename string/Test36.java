package string;

 class MyString {
	
	String msg;
	MyString(String msg){
		this.msg=msg;
		}
	public String toString() {//overridden
		return msg;
	}
	}
public class Test36{ 

	public static void main(String[] args) {
		System.out.println("Hello "+new StringBuffer("Java SE 8"));
		System.out.println("Hello "+new MyString("Java SE 8"));
		}
	}

