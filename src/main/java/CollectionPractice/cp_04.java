package CollectionPractice;

import java.util.*;

public class cp_04 {

    public static void main(String args[]) {

        HashMap<String,Integer> map= new HashMap<>();

        map.put("ram",33);
        map.put("charan",34);
        map.put("shyam",32);


        Set<String> set = map.keySet();
        ArrayList<String> listOfKeys = new ArrayList<>(set);
        System.out.println(listOfKeys);


        Collection<Integer> setValues = map.values();
        ArrayList<Integer> listOfValues = new ArrayList<>(setValues);

        System.out.println(listOfValues);




    }
}