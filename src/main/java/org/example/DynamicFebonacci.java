package org.example;
import java.util.Scanner;
public class DynamicFebonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number ");

        int n = scan.nextInt();

        int fibn = fibo(n);
        System.out.println();
    }
    public static int fibo(int n) {
       /* if (n == 0 || n == 1) {
            return n;
        }*/

        if(n==0 || n==1){
            return n;
        }
        System.out.println("Hello" + n);
        int fi1 = fibo(n - 1);
        int fi2 = fibo(n - 2);
        int fibn = fi1 + fi2;
        return fibn;
    }
    public static int FibMemoized(int n,int[] qb){
        if(n==0|| n==1){
            return n;

        }
        if(qb[n] !=0){
            return qb[n];
        }
        int fibnm1 = FibMemoized(n-1,qb);
        int fibnm2 = FibMemoized(n-1, qb);
        int fibn = fibnm1 + fibnm2;
        qb[n] = fibn;
        return fibn;
    }
}