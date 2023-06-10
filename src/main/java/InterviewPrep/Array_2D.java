package InterviewPrep;

import java.util.Scanner;

public class Array_2D {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size:");
       int inputs = s.nextInt();


        int[] arr = new int[inputs];
        for (int i = 0; i < inputs; i++) {

            arr[i] = s.nextInt();
            System.out.println("i.." + i);
            //  System.out.println("value..."+value);

        }
        for (int i = 0; i < inputs; i++) {
            System.out.println("arr..." + arr[i]);
        }
    }
}
