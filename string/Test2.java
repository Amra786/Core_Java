package string;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Anam");
		StringBuffer sb2 = new StringBuffer("Anam");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		}
	}
