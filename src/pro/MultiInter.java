interface Programmer
{
void displayP();
}
interface Engineer
{
void displayE();
}
interface Innovator
{
void displayI();
}
class Student implements Programmer,Engineer,Innovator
{
public void displayP()
{
System.out.println("i am a good Programmer");
}
public void displayE()
{
System.out.println("i can built software product");
}
public void displayI()
{
System.out.println("i have innovative skills");
}
}
class MultiInter
{
public static void main(String as[])
{
Student ob=new Student();
ob.displayP();
ob.displayE();
ob.displayI();
}
}
