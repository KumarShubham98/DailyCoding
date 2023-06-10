package Map;

import java.util.*;

public class Map_02 {

    public static void main(String[] args)
    {
        //Creating the HashMap

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        //Adding key-value pairs to HashMap

        map.put(1, "AAA");

        map.put(2, "BBB");

        map.put(3, "CCC");

        map.put(4, "DDD");

        map.put(5, "EEE");


        String value2 = map.get(5);

        System.out.println(value2);

        String value3 = map.get("DDD");

        System.out.println(value3);


        HashMap<String, Integer> map1 = new HashMap<String, Integer>();

        map1.put("ONE", 11234);

        map1.put("TWO", 2);

        map1.put("THREE", 3);




        int value1 = map1.get("ONE");

        System.out.println(value1);

        //Retrieving the Key Set

        Set<Integer> keySet = map.keySet();

        for (Integer key : keySet)
        {
            System.out.println(key);
        }

        Set<Integer> list = map.keySet();

        for (Integer i : list)
        {
            System.out.println(i);
        }

        System.out.println(map.size());      //Output : 5

        //Clearing the map

       // map.clear();

        //Checking the number of key-value pairs after clearing the map

    //    System.out.println(map.size());









        System.out.println(map.containsKey(3));      //Output : true

        //Checking whether value '3.3' exist in map

        System.out.println(map.containsValue(3.3));   //Output : true





      /* Set<Map.Entry< Integer,String>> entrySet = map.entrySet();

        for (Map.Entry<Integer,String> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        Set<Map.Entry< String,Integer>> entrySet1 = map1.entrySet();

        for (Map.Entry<String,Integer> entry1 : entrySet1)
        {
            System.out.println(entry1.getKey()+" : "+entry1.getValue());
        }*/



        Set<Map.Entry<Integer,String>>   entrySet = map.entrySet();

        for(Map.Entry<Integer,String> i : entrySet ){

            System.out.println(i.getKey()+": "+i.getValue());

        }






    }






}
