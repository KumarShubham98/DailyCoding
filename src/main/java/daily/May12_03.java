package daily;

import java.util.Arrays;

/*Palindrome: Write a function that takes a string as input and returns
true if the string is a palindrome, and false otherwise.*/
public class May12_03 {
    public static void main(String args[]) {

        String str = "radar";   // 1. reverse
        char[] ch =str.toCharArray();
        System.out.println(ch);
        char[] ch1 = str.toCharArray();
        int n = str.length();
        int j= n-1;
        for(int i =0;i<n;i++){
            ch1[i]=str.charAt(j);
                j--;

        }

      /*  for(int i =0;i<=n-1;i++){
           // System.out.println(ch1);

            if(str.charAt(i)==ch1[i]){  // radar == radar

            }

        }*/
        System.out.println(ch1);

        if(Arrays.equals(ch,ch1)){
            System.out.println("palindrome");
        }else {

            System.out.println("not a palindrome");
        }


    }
}
