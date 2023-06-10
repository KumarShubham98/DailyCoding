package kunal.functions_MethodsInJava;

import java.util.Scanner;

public class SumOfTwoNumber {


    public static void main(String[] args) {


    //   sum();
    //   sum1();
         sum(1,2);
        sum1(3,4);


    }

    static void sum(int a , int b){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a and b: ");
       // int a= scan.nextInt();
     //   int b= scan.nextInt();
        int ans =a+b;
        System.out.println(ans);

    }


    static void sum1(int a, int b){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a and b: ");
      /*  int a= scan.nextInt();
        int b= scan.nextInt();*/
        int ans =a+b;
        System.out.println(ans);

    }


}
