package pro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeMap;

class CollectionBase {

    public void arrayListExample() {
        System.out.println("----- ArrayList Example -----");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list + "\n");
    }

    public void linkedListExample() {
        System.out.println("----- LinkedList Example -----");
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");
        System.out.println("LinkedList: " + list + "\n");
    }

    public void hashSetExample() {
        System.out.println("----- HashSet Example -----");
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        System.out.println("HashSet: " + set + "\n");
    }

    public void hashMapExample() {
        System.out.println("----- HashMap Example -----");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        System.out.println("HashMap: " + map + "\n");
    }

    public void treeMapExample() {
        System.out.println("----- TreeMap Example -----");
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "Madhu");
        tm.put(2, "Kiran");
        tm.put(3, "Sai");
        System.out.println("TreeMap: " + tm + "\n");
    }
}

public class Tree_set extends CollectionBase {

    public static void main(String[] args) {
        Tree_set demo = new Tree_set();

        demo.arrayListExample();
        demo.linkedListExample();
        demo.hashSetExample();
        demo.hashMapExample();
        demo.treeMapExample();
    }
}
