package pro;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack<String> Toybox = new Stack<String>();
		Queue<String> Icecreamline = new LinkedList<String>();
			Toybox.push("Ball");
			Toybox.push("Blocks");
			Toybox.push("Puzzle");
			System.out.println(Toybox);
			String Firsttoy = Toybox.removeFirst();
					
			System.out.println(Firsttoy);
			System.out.println(Toybox);
			Icecreamline.add("Maya");
			Icecreamline.add("Leo");
			Icecreamline.add("Nina");
			System.out.println("ice cream was served to:"+ Icecreamline.poll());
			System.out.println("remaining kids:" + Icecreamline);
			
		

	}

}
