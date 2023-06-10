package Array;

import java.util.Arrays;

public class Array_04 {
//1. Write a Java program to sort a numeric array and a string array.
    public static void main(String args[]){

        int arr[] = {6,7,4,9,3,2,9,88};
  String[] st={"ram","shyam","lucky"};
       /* for(int i=0;i<8;i++){
            for(int j=i+1;j<8;j++){
                if(arr[i]> arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j] =temp;
                }

            }

        }

        for(int i=0;i<8;i++){
            System.out.println(arr[i]);

        }*/
    //    System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

     //   System.out.println(Arrays.toString(st));
        Arrays.sort(st);
        System.out.println(Arrays.toString(st));

    }
}
