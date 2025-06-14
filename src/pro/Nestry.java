class Nestry
{
public static void main(String as[])
{
int a=10,b=0,c;
int x[]=new int[10];
try
{
try
{
c=a/b;
}
catch(ArithmeticException e)
{
System.out.println("AE handled");
}
try
{
x[11]=40;
}
catch(ArithmeticException e)
{
System.out.println("AIOBE handled");
}
}
catch(Exception e)
{System.out.println("outer try exception handled");
}}}
