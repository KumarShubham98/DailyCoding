package Array;


import java.util.Scanner;

//Find the maximum & minimum number in an array of integers.
public class Array_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for(int i=0;i< size ;i++){
           arr[i] =scan.nextInt();
        }
/* int max =arr[0];
        int min = arr[0];*/

        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i< size ;i++){

            if(max<arr[i]){
                max= arr[i];
            }
            if(min>arr[i]){
                min= arr[i];
            }
        }
        System.out.println(max+" "+Integer.MAX_VALUE);
        System.out.println(min+" "+Integer.MIN_VALUE);

    }
}
