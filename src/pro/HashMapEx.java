package pro;

import java.util.TreeMap;  // <-- Add this line

public class HashMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "madhu");
		tm.put(2, "kiran");
		tm.put(3, "sai");
		System.out.println(tm);
	}
}
