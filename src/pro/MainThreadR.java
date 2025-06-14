class RunnableThread implements Runnable
{
String name;
RunnableThread(String name){
this.name=name;
}
public void run()
{
System.out.println("i am child thread,created from main thread");
System.out.println("child thread prints from 10.....1");
try
{
for(int i=10;i>=1;i--)
{
System.out.println(name+":"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println("child thread exited");
}
}
class MainThreadR
{
public static void main(String as[])
{
RunnableThread ob=new RunnableThread("child thread");
Thread t=new Thread(ob);
t.start();
System.out.println("main thread prints from 1.....10");
try
{
for(int i=1;i<=10;i++)
{
System.out.println("main thread:"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
e.printStackTrace();
}
System.out.println("main thread compleated");
}
}