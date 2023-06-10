package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leet_189_Rotate_Array {

    public static void main(String[] args) {
// 1 2 3
// 3 1 2    step1
// 2 3 1    step2

        int arr[] = new int[]{1,2,3,4};
        int k =2;
           rotate( arr,k);

        System.out.println(Arrays.toString(arr));

    }




    public static void rotate(int[] a, int k) {

    //    throw new IllegalArgumentException("Illegal argument!");
        System.out.println(Arrays.toString(a));
        for(int i=0;i< k;i++){
            for(int j=a.length-1; j>0 ;j--){

              int t = a[j];
                a[j] = a[j-1];
                a[j-1]= t;
                System.out.println(Arrays.toString(a));

            }
        }

    }




}