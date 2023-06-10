package LinearDataStructureArray_01;
//A program P reads in 500 integers in the range [0..100] representing the scores of 500 students.
// It then prints the frequency of each score above 50. What would be the best way for P to store the frequencies? (GATE CS 2005)

import java.util.Scanner;

public class DsArray_01 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);


        int p[] = new int[]{1,2,3,4,5,61,11,22,5,555,};

/*
        for (int i = 0; i < p.length; i++) {

            p[i] = scan.nextInt();
        }*/


        for (int i = 0; i < p.length; i++) {

            if(p[i]>50){

                System.out.println(i);
            }
        }

    }

}
