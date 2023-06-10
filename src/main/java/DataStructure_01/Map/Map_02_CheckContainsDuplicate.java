package DataStructure_01.Map;

import java.util.HashMap;

public class Map_02_CheckContainsDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 2};
        boolean hasDuplicates = false;


        HashMap<Integer, Integer> fmap = new HashMap<>();


        for (int num : arr) {

            fmap.put(num, fmap.getOrDefault(num, 0) + 1);
        }

        for (int count : fmap.values()) {

            if (count > 1) {

                hasDuplicates = true;
                System.out.println(hasDuplicates);
                break;
            }


        }

    }


}



