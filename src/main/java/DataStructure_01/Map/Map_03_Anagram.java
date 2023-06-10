package DataStructure_01.Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Map_03_Anagram {

    public static void main(String[] args) {

      /*  Write a java program that reorders the digits of each numerical element in an array based on
        descending order.
        Input: [515, 341, 98]


        
        Descending order  -> [551, 431, 98]
                               954
*/

/*

        List<Integer> list = Arrays.asList(515);

        Collections.sort(list,Collections.reverseOrder());


        System.out.println(list);

*/

        int [] arr = new int[]{515, 341, 98};
        int[] b;

   for(int i=0;i<arr.length;i++){

       int number = arr[i];

       // Convert the number to a string
       String numberString = String.valueOf(number);

       // convert the String to the array of characters

       char [] digits = numberString.toCharArray();
       // Sort the array of characters in descending order
       Arrays.sort(digits);


       StringBuilder sortedStringBuilder = new StringBuilder(new String(digits));
       String sortedString = sortedStringBuilder.reverse().toString();

       // Parse the string back to an integer
       int sortedNumber = Integer.parseInt(sortedString);

       System.out.println(sortedNumber);

          //b[i]= sortedNumber;



   }




    }

    }
