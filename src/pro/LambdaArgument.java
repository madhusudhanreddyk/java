interface NumbericTest
{
boolean test(int n);
}
class LambdaArgument
{
public static void main(String as[])
{
NumbericTest isNum = (n) -> (n/2) == 0;
if(isNum.test(10));
System.out.println("it is even number");
if(!isNum.test(9));
System.out.println("it is odd number");
NumbericTest myNum = (n) -> n >= 0;
if(myNum.test(8)) System.out.println("it is positive number");
if(!myNum.test(-8)) System.out.println("it is negative number");
}
}

