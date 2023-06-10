package Leetcode;

public class Leet_744 {
    //744. Find Smallest Letter Greater Than Target
   // Input: letters = ["c","f","j"], target = "a"
  //  Output: "c"


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
