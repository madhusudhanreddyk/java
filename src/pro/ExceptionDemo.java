import java.util.*;
class ExceptionDemo
{
public static void main(String as[])
{
Scanner sin= new Scanner(System.in);
System.out.println("Enter a,b");
int a=sin.nextInt();
int b=sin.nextInt();
try
{
int c=a/b;
System.out.println("c="+c);
}
catch(ArithmeticException e)
{
System.out.println("Exception occured="+e);
}
}
}
