package pro;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		Scanner nums = new Scanner(System.in);
		
		int num = nums.nextInt();
		if(num%2 ==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num +" is odd");
		}

	}

}
