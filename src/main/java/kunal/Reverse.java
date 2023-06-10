package kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {


public static  void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] a1 = new int[n];

    for(int i=0;i<=a1.length-1;i++) {

        a1[i]=scan.nextInt();
    }

  int b[] = new int[a1.length];

    int j= n-1;

        for(int i=0;i<= a1.length-1;i++){

        b[i]= a1[j];
        j--;
    }


    for(int i =0; i<=b.length-1;i++){

        System.out.println(b[i]);
    }


}































/*


    public static void main(String args[]) {

        int[] arr = {11,2,33,44,22};

        reverse(arr);
    //    swap(arr,1,4);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] ar){

        int start=0;
        int end =ar.length-1;

        while (start<end){
            swap(ar,start,end);
            start++;
            end--;

        }


    }

    static void swap(int[] arrr,  int index1, int index2){

        arrr[index1]= arrr[index1]^ arrr[index2];
        arrr[index2]= arrr[index1]^ arrr[index2];
        arrr[index1]= arrr[index1]^ arrr[index2];
    }
*/






















    /*public static void main(String args[]) {


        int arr[] ={1,2,3,4,5};
     //   swap(arr,0,4);
    reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void reverse(int[] arr){

        int start =0;
        int end =arr.length-1;

        while(start< end){
         swap(arr,start,end);
       start++;
       end--;
        }

    }
      static void swap(int[] arr,int
                       index1,int index2){

      *//*  int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;*//*

          arr[index1] =  arr[index1]^ arr[index2];
          arr[index2] =  arr[index1]^ arr[index2];
          arr[index1] =  arr[index1]^ arr[index2];



         *//* arr[index1] =  arr[index1]+arr[index2];
          arr[index2] =  arr[index1]-arr[index2];
          arr[index1] =  arr[index1]- arr[index2];
*//*




      }*/


    }
