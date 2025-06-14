interface MyNumber
{
double getValue();
}
class Lambda
{
public static void main(String as[])
{
MyNumber myNum;
myNum = () -> 123.56;
System.out.println("the fixed number:"+myNum.getValue());
}
}