package org.example;
import oops.Inheritance_01;

import java.util.Scanner;

public class Main {

   public void main(String[] args){
       child1 c1 = new child1();
       c1.disp();
       child2 c2 = new child2();
       c2.disp();




    }


    public class Parent{

        String abc = "hari";
        public void disp(){
            System.out.println("Hello11");
        }

    }

    class child1 extends Parent {

    }

    class child2 extends Parent {

    }


}
/*
0 0 0 0 0
0 0 0 1 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0


        A00 A01 A02 A03  A04
        A10 A11 A12 A13  A14
        A20 A21 A22 A23  A24
        A30 A31 A32 A33  A34
        A40 A41 A42 A43  A44


A22 = 1 target

*/







































/* Scanner scan = new Scanner(System.in);
    int colm = 3;
    int sum =0;
    System.out.println("Please enter number of lines: ");
    int n = scan.nextInt();
    int a[][] = new int[n][3]; //n =3

    for(int i=0;i<n;i++) {
        for (int j = 0; j < 3; j++) {

            //  System.out.println("please enter " );
            a[i][j] = scan.nextInt();

        }
    }
        for (int c=0;c<3;c++){
          for(int r=0;r<n;r++){

                sum = a[r][c] +sum  ;        //6   11  11

         }

    }
       if (sum ==0){
           System.out.println("True");
       }else{
           System.out.println("false");
       }*/








