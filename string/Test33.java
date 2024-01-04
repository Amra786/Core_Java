package string;

public class Test33 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("amra").append("solutions").reverse().insert(2,"xyz").delete(3,7);
		System.out.println(sb);

	}

}
