class MyOwnException extends Exception
{
public MyOwnException(String s)
{
super(s);
}
}
class User
{
public static void main(String as[])
{
try
{
throw new MyOwnException("vinay");
}
catch(MyOwnException e)
{
System.out.println(e.getMessage());
System.out.println("hi mava");
}
}
}