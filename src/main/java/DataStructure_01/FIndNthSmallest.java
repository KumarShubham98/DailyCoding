package DataStructure_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FIndNthSmallest {

    public static void main(String args []){

        List<Integer> numbers = Arrays.asList(5,4,3);  // 1,2,3,4,5,6 // 2,3,4,5
        int n = 3;

        int SmallestNumber = findSmallestNumber(numbers, n);
        System.out.println(SmallestNumber);

    }

    private static int findSmallestNumber(List<Integer> numbers, int n) {


        if(numbers.isEmpty()|| n<=0|| n>numbers.size()){
            throw new IllegalArgumentException("Invalid input");
        }


        Collections.sort(numbers);
        return numbers.get(n-1);
    }
}
