interface NumbericFun
{
int func(int n);
}
class BlockLambda1 
{
public static void main(String as[])
{
NumbericFun factorial = (n) -> { int result = 1;
				for(int i = 1;i<=n;i++)
				result = i*result;
				return result;};
System.out.println("the factorial of a given number is:"+factorial.func(5));
}
}