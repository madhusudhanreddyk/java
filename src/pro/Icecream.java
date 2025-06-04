package pro;

import java.util.LinkedList;
import java.util.Queue;

public class Icecream {

	public static void main(String[] args) {
		Queue<String> truck = new LinkedList<String>();
			truck.add("kid 1");
			truck.add("kid 2");
			truck.add("kid 3");
			truck.add("kid 4");
			System.out.println(truck);
			System.out.println("the above kids are waiting...");
			System.out.println(truck.poll()+" taked");
	}

}
