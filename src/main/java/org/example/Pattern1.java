package org.example;

import sun.awt.X11.XConstants;

import java.util.ArrayList;
import java.util.Iterator;

public class Pattern1 {
    public static void main(String args[]) {

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


/*
  pattern1*

  public static void main(String args[]) {
        for (int j=0; j<5;j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
 */
