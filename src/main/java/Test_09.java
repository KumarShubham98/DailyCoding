import java.util.*;

public class Test_09 {

    public static void main(String[] args) {


        HashMap<Integer, String> list = new HashMap<>();

        list.put(1, "abc");
        list.put(2, "abcd");
        list.put(3, "abce");
        list.put(4, "abcf");


   //     Collections.sort(map);

        //  System.out.println(list);


    /*    for (Map.Entry<Integer, String> entry: list.entrySet()) {

            System.out.println(entry.getValue()+entry.getKey());
        }*/


        Iterator<Integer> it = list.keySet().iterator();

        while (it.hasNext()) {
            int key = it.next();

            System.out.println(key + list.get(key));

        //    System.out.println();
            //     int key=(int)it.next();
            //  System.out.println("Roll no.: "+key+"     name: "+list.get(key));
        }

       /*     for (Integer i : list.keySet() ) {
                System.out.println(i);
            }

            for (String i1 : list.values() ) {
                System.out.println(i1);

            }
*/


    }


}
