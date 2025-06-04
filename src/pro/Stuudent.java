package pro;

public class Stuudent {

	private String name;
	private int rollno;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public static void displaydetails() {
		System.out.println("Roll no"+" "+ getRollno());
		System.out.println("Name"+" "+getName());
		System.out.println("Marks"+" "+getMarks());
		System.out.println("result" + " "+get);
	}
	public static void main(String[] args) {
		
		

	}

}
