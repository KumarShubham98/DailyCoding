package TcsInterviewPractice;


import java.util.Scanner;

/*
12 Display the sum of 1st n natural no
13 Display all multiple of 5 bat" 11 and 1001
14 Take 3 number from user and print largest.
15 Take integer from ures & doplay corresponding
day of the cock (eg 1-sonday, mondlay)
16 Print First in odd/even numbers
17 Display sum at First n ood and n even number seperatly
18 Print all odd numbers between 'a and 'b'.
*/
public class T_03 {

    public static void main(String[] args) {

        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");


    }

}