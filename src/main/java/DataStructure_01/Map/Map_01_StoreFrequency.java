package DataStructure_01.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_01_StoreFrequency {


    public static void main(String[] args) {
     //   List<Integer> numbers = Arrays.asList(9, 8, 1, 6, 4);
        int[] numbers = {1, 2, 3, 1, 2, 1, 3, 4, 5};

        Map<Integer, Integer>  storefrequency = new HashMap<>();

        for(int num : numbers){

            storefrequency.put(num, storefrequency.getOrDefault(num, 0) + 1);
        }


        System.out.println(storefrequency);






    }



}
