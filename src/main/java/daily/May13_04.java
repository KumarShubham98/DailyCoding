package daily;

import java.util.Scanner;

//write a program to find the maximum and minimum values in the array
public class May13_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                if (min > arr[i]) {
                    min = arr[i];
                }
            }

        }


        System.out.println(max);
        System.out.println(min);
    }
}
