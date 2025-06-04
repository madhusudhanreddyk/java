package pro;

public class String_rev {

	public static void main(String[] args) {
		String name = "madhu";
		String reverse = "";
		for(int i=name.length()-1;i>=0;i--) {
			reverse += name.charAt(i);
			
		}
System.out.println(reverse);

	}

}
