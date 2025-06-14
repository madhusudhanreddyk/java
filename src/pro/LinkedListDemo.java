import java.util.*;
class LinkedListDemo
{
public static void main(String as[])
{
LinkedList<String> ll = new LinkedList<String>();
ll.add("w");
ll.add("e");
ll.add("r");
ll.add("t");
ll.add("y");
ll.add("u");
ll.addFirst("q");
ll.addLast("i");
ll.add(1,"o");
System.out.println("the intial ll values:"+ll);
ll.remove("r");
ll.remove(1);
System.out.println("after removing some elements:"+ll);
ll.removeFirst();
ll.removeLast();
System.out.println("after removing first and last elements:"+ll);
}
}