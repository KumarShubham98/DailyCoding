package kunal;

import java.util.Arrays;
//https://leetcode.com/tag/array/

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class smallest_letter {

    public static void main(String[] args) {

        char[] letter ={'c','f','g'};
        char target= 'a';
        char res=   nextGreatestLetter(letter,target);
        System.out.println( res);
    }

    static char nextGreatestLetter(char[] letters, char target) {


        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;



            if (target < letters[mid]) {
                end = mid - 1;
            } else {


                start = mid + 1;
            }


        }

        return letters[start % letters.length];

    }




}







