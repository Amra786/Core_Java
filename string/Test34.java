package string;

public class Test34 {

	public static void main(String[] args){
		StringBuffer sb = new StringBuffer(5);
		String s ="";
		if(sb.equals(s)) {
			System.out.println("Match 1");
		}
		else if(sb.toString().equals(s.toString()))
		{
			System.out.println("Match 2");
		}
		else {
			System.out.println("no Match");
			}
		}
	}


