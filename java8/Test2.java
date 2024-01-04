package java8;

import java.util.function.Consumer;

public class Test2 {

	public static void main(String[] args) {
		Consumer<String> c=s-> System.out.println(s);
		c.accept("Hello");
		c.accept("DURGASOFT");
	}

}
