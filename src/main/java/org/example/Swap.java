package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// swapping number by using 3rd variable. 10:56 am 30 August
public class Swap {

    public static void main(String args[]){

        List list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Iterator i = list.iterator();
        System.out.print("printing the list....");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        Iterator i2 = list.iterator();
        Collections.reverse(list);

        System.out.println("printing list in reverse order....");
        while(i2.hasNext())
        {
            System.out.println(i2.next());
        }
    }

}
