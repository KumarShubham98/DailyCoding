package TcsInterviewPractice;
/*
20 Make a basic calculator
21 swap 2 no. Without 3rd variable?
22 Revise number by giving user input?
23 Check prime number by giving user input?
24 ropy the number from 1 array to other array?
25 Print Sq no and add same no by given user impl?
26 Find 2nd largest, smallest no. by given user input?
27 Find Factorial of a number?
28 Print first 'n' prime number
29 WAP  to check palindrome or not ?
30 WAP to chest String Palindrome or not?
31 WAP to find duplicate number 9?
 */
public class T_02 {

    public static void main(String args[]) {

        String s ="asa";
        String rev =" ";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)){
            System.out.println("this is palindrome char: " +rev);
        }
else{
            System.out.println("not palindrome char:"  +s );
        }
    }
}
