package pro;

import java.util.Scanner;

public class Calender{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Day = sc.nextLine().toLowerCase();
		switch(Day) {
		case "Monday":
			System.out.println("let's learn python");
			break;
		case "Tuesday":
			System.out.println("let's learn DSA");
			break;
		case "Wednesday":
			System.out.println("let's learn java");
			break;
		case "Thursday":
			System.out.println("let's learn c++");
			break;
		case "Friday":
			System.out.println("let's learn R");
			break;
		case "Saturday":
			System.out.println("let's learn JS");
			break;
		case "Sunday":
			System.out.println("let's learn web");
			break;
		default :
			System.out.println("enter the weekday");
				
		}
		sc.close();
	}

}
