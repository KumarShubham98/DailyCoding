package CollectionPractice;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class Cp_03 {

    public static void main(String args[]) {

        ArrayDeque ad = new ArrayDeque();

        ad.add(11);

        ad.add(13);
        ad.add(14);
        ad.add(15);
       // ad.peek();
        ad.poll();


        System.out.println(ad);



    }
}