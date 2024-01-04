package Collection;

import java.util.Stack;

public class StackDemo3 {

	public static void main(String[] args) {
		
		Stack<Object> s=new Stack<Object>();
					s.push("A");
					s.push("B");
					s.push("C");
				System.out.println(s);
				System.out.println(s.search("A"));//3
				System.out.println(s.search("Z"));//-1
				}
		}

