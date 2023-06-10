package org.example;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class programiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5]; // this line contains 5*5 matrix
        boolean flag = false;

          for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = sc.nextInt();
            }
        }
//          for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(arr[i][j]==1){
//                    System.out.println(Math.abs(2-j)+Math.abs(2-i));
//                    break;
//                }
//            }
//            if(flag){
//                break;
//            }
//        }
    }
}





































/*
Hacker rank 1

        int n = scan.nextInt();

        if(n%2!=0){

            System.out.println("Weird");

        } else if(n%2==0 && n>=2 && n<=5){

            System.out.println("Not Weired");

        }else if(n%2==0 && n>=6 && n<=20){

            System.out.println("Weired");

        }else if(n%2==0 && n>20 ){


            System.out.println("Not Weired");
        }



 */

/*
        int i = scan.nextInt();

        double d = scan.nextDouble();
         scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/