package DataStructure_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortInDescOrder {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 8, 1, 6, 4);

        // Collections.sort(numbers,Collections.reverseOrder());
        // numbers.sort(Collections.reverseOrder());
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}