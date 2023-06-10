package DataStructure_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonElements {

    public static void main(String args[]){

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(5,6,7,8,8,1,2);

        HashSet<Integer> set1 = new HashSet<>(list1);
        List<Integer> commonElements = new ArrayList<>();

        for(int num : list2){

            if(set1.contains(num)){

                commonElements.add(num);
            }

        }


        System.out.println(commonElements);
    }
}
