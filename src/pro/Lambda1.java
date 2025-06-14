interface MyNumber
{
double getValue();
}
class Lambda1
{
public static void main(String as[])
{
MyNumber myNum;
myNum = () -> 123.45;
System.out.println("the fixed number:"+myNum.getValue());

myNum = () -> Math.random()*100;
System.out.println("the fixed number:"+myNum.getValue());
}
}
