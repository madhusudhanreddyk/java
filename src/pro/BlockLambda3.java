interface StringFun
{
String func(String s);
}
class BlockLambda3
{
public static void main(String as[])
{
StringFun reverse = (s) -> { String result = "";
				for(int i=s.length()-1;i>=0;i--)
				result += s.charAt(i);
				return result;};
System.out.println("the reverse of MADHU:"+reverse.func("MADHU"));
StringFun upper = (s) -> { String result = s.toUpperCase();
				return result;};
System.out.println("madhu in uppercase letters:"+upper.func("madhu"));
}
}