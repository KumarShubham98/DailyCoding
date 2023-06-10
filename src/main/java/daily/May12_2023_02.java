package daily;


import java.util.Scanner;

import static daily.May12_2023_02.fibo;

// Fibonacci Series using Recursion
public class May12_2023_02 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("number");
        int n = scan.nextInt();

        System.out.println(fibo(n));
    }


    static int fibo(int n){
        if (n <= 1)
            return n;
        return fibo(n-1)+fibo(n-2);

    }
}

// 3 ->  2+1=3