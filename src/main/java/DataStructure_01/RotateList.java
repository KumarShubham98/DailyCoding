package DataStructure_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 8,  1, 6, 4);

        Collections.rotate(numbers,1);

        System.out.println(numbers);

    }

    }
