interface  NumbericFun
{
int func(int n);
}
class BlockLambda
{
public static void main(String as[])
{
NumbericFun  factorial = (n) -> {int result=1;
				for(int i =1;i<=n;i++)
				result = i * result;
				return result;};
System.out.println("the factorial of 5 is:"+factorial.func(5));
}
}