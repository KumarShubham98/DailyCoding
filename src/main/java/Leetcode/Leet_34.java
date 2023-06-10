package Leetcode;

import java.util.Arrays;

public class Leet_34 {
    public static void main(String[] args) {


        int arr[] = new int[]{1,2,3,4,5,6,7};

        int k =3;

        rotateArray(arr,k);

    }





    public static void rotateArray(int[] arr,int k){

        System.out.println(Arrays.toString(arr));
        for(int i=0;i<k;i++){
            for(int j= arr.length-1;j>0;j--){

                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
