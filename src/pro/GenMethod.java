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
class GenMethod
{
public static void main(String as[])
{
NonGen ob=new NonGen();
System.out.println("swaping of numbers");
ob.swap(new String ("madhu"),new String ("kiran"));
}
}