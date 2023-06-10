package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class linkedlist_002 {


    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");


        Iterator p = list.listIterator(1);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}