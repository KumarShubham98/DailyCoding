package Array;


import java.util.Scanner;

//Take an array of numbers as input and check if it is an array sorted in ascending order.
public class Array_03 {

    public static  void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for(int i=0;i< size ;i++){
            arr[i] =scan.nextInt();
        }

        Boolean asc =true;


        for(int i=0;i< size-1 ;i++){

            if(arr[i] > arr[i+1]){
               asc = false;
            }
        }


        if(asc) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }



    }

}
