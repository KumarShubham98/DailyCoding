package CollectionPractice;

import java.util.*;

public class Cp_01 {

    public static void main(String args[]){

        ArrayList al1 = new ArrayList();

        al1.add(11);
        al1.add(12);
        al1.add(13);
        al1.add(14);
        al1.add(15);


        al1.add(2,1005);
        System.out.println(al1);
        System.out.println("_________________");
        ArrayList al2 = new ArrayList();
        al2.add(13);
        al2.add(14);
        al2.add(15);
        al2.addAll(al1);
        System.out.println(al2 +"this");
    //  al2.set(1,22);
     //   System.out.println(al2);
        al2.set(1,al1);
        System.out.println(al2);

        System.out.println("_________________");
        al2.add(1,al1);
        System.out.println(al2);
        System.out.println("_________________");

        al2.addAll(al1);
        System.out.println(al2 +"this2");

        System.out.println("_________________");
        ArrayList al3 = new ArrayList();
        al3.add(101);al3.add(102);al3.add(103);

      // al3.clone();
        System.out.println(al2 +"old");
        al2= (ArrayList)al3.clone();
       System.out.println(al2 +"clone");

        System.out.println("_________________");

        ArrayList al4 = new ArrayList();

        al4.add(111);
        al4.add(121);
        al4.add(13);//2
        al4.add(14);//3
        al4.add(15);
        al4.add("hkm");
        al4.add(1211);
        al4.add(1221);
        al4.add(1231);
        System.out.println(al4);
        System.out.println("get: "+al4.get(2)); //131
        System.out.println("index: "+ al4.indexOf("hkm"));
        System.out.println("sublist: " + al4.subList(1,2));//
        System.out.println("contains: " +al4.contains(121)); //true
        System.out.println("contains all" + al4.size()); //5
      al4.remove(1);
        System.out.println(al4);
        System.out.println(al4.remove(2));

        al4.removeAll(al2);
        System.out.println(al4 +"sk");











        ArrayList al5 = new ArrayList();

        al5.add(11);
        al5.add(121);
        al5.add(111);
        al5.add(121);

        ArrayList al6 = new ArrayList();

       al6.add(111);
       al6.add(121);


        al5.removeAll(al6);
        System.out.println(al5);


     boolean result = al6.isEmpty();
        System.out.println("empty: "+result);


        al1.clear();
        System.out.println(al1 +"clear");



    }
}
