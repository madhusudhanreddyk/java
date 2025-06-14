interface StringFun
{
String func(String n);
}
class BlockLambda2
{
public static void main(String as[])
{
StringFun reverse = (s) -> { String result = "";
				for(int i=s.length()-1;i>=0;i--)
				result += s.charAt(i);
				return result;};
System.out.println("lambda reverse is:"+reverse.func("lambda"));
}
}