package org.example;
//Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.*;

public class Leet_02Addtwonumber {
    public static void main(String args[]){

        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        Iterator itr=list.iterator();//getting the Iterator
        while(itr.hasNext()){//check if iterator has the elements

            String str = (String) itr.next();
            System.out.println(str);
           // if(str.equals("Apple")) {
   //              itr.remove();
   //             continue;

            }
            // System.out.println(str); //printing the element and move to next
          //  System.out.println(list);
        }
    }
//}