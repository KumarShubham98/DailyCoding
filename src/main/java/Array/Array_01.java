package Array;

import java.util.Scanner;

public class Array_01 {
//Take an nameray of names as input from the user and print them on the screen

    public static void main(String[] namegs) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        String name[]  = new String[size];

        for(int i=0; i< name.length;i++){

            name[i]=scan.nextLine();
        }



        for(int i=0; i< name.length;i++){

            System.out.println(name[i]);
        }



    }
    }
