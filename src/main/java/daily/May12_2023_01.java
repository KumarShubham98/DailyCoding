package daily;

import java.util.Scanner;

public class May12_2023_01 {
/*
FizzBuzz: Write a program that prints the numbers from 1 to 100.
 For multiples of three, print "Fizz" instead of the number.
For multiples of five, print "Buzz".
 For numbers which are multiples of both three and five, print "FizzBuzz".

*/

    public static void main(String args[]){

     Scanner scan = new Scanner(System.in);
        System.out.println("size");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){

            if(i%3==0) {
                System.out.println("Fizz");
            }
            if(i%5==0) {
                System.out.println("Buzz");
            }  if((i%3==0)&&(i%5==0) )  {
                System.out.println("FizzBuzz");
            }


        }


    }
}
