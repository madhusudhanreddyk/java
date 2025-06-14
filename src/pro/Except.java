class Except
{
public static void main(String as[])
{
int a=10,b=0,c;
try
{
c=a/b;
}
catch(Exception e)
{
System.out.println("ArithmeticException handled");
System.out.println(e.getMessage());
}
finally
{
System.out.println("finally is executed");
}
}
}