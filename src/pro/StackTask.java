package pro;

import java.util.Stack;

public class StackTask {

	public static void main(String[] args) {
		Stack<String> kitchen = new Stack<String>();
			kitchen.push("plate 1");
			kitchen.push("plate 2");
			kitchen.push("plate 3");
			kitchen.push("plate 4");
			kitchen.push("plate 5");
			System.out.println("take " +kitchen.peek()+"to eat");
			kitchen.pop();
			System.out.println(kitchen);
				
	}

}
