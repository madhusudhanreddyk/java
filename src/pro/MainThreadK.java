class RunnableThread implements Runnable{
 String name;
RunnableThread(String name){
 this.name=name;
}
public void run(){
 System.out.println("I am Child Thread,created from Main Thread");
 System.out.println("Child Thread Prints from 10.....1");
 try{
 for(int i=10;i>=1;i--){
 System.out.println(name+":"+i);
Thread.sleep(1000);
 }
 }catch(InterruptedException e){
 e.printStackTrace();
 }
 System.out.println("Child Thread Exited");
}
}
class MainThreadK{
 public static void main(String args[]){
 System.out.println("From Main Thread");
 RunnableThread r=new RunnableThread("Child Thread");
 Thread t=new Thread(r);
 t.start();
 System.out.println("Main Thread Prints from 1.....10");
 try{
 for(int i=1;i<=10;i++){
 System.out.println("Main Thread:"+i);
 Thread.sleep(1000);
 }
 }catch(InterruptedException e){
 e.printStackTrace();
 }
 System.out.println("Main Thread Completed");
 }
}