package java8;

import java.util.function.Consumer;

public class Test48 {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Amra");
		c.accept("Anam");
		}
	}
