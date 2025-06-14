class NonGen
{
<T> void swap(T a,T b)
{
System.out.println("before swaping:"+a+","+b);
T temp;
temp=a;
a=b;
b=temp;
System.out.println("after swaping:"+a+","+b);
}
}
class GenMethod1
{
public static void main(String as[])
{
NonGen ob=new NonGen();
System.out.println("swapping of Strings");
ob.swap(new String("vinay"),new String("sai"));
System.out.println("swapping of integers");
ob.swap(new Float(3.79F) , new Float(4.99F));
}
}