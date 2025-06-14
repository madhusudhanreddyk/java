class ClassA
{
public void displayA()
{
System.out.println("disp() method of class A");
}
}
interface InterfaceB
{
public void show();
}
class ClassC extends ClassA implements InterfaceB
{
public void show()
{
System.out.println("show() method implementation");
}
public void displayC()
{
System.out.println("class C is executed");
}
}
class HibridInter
{
public static void main(String as[])
{
ClassC ob=new ClassC();
ob.displayA();
ob.show();
ob.displayC();
}
}