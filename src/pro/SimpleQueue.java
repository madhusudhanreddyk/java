package pro;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
		Queue<String> students = new LinkedList<String>();
			students.add("student 1");
			students.add("student 2");
			students.add("student 3");
			System.out.println(students);
			System.out.println(students.poll());
			System.out.println(students.remove());

			System.out.println(students.remove());
			System.out.println(students.poll());
			
			System.out.println(students);
	}

}
