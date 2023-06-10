package kunal;

import java.util.Arrays;

public class Swap {

    public static void main(String args[]) {

int arr[] ={1,2,3,45,31};
    swap(arr,2,4);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int ar[] ,int index1, int index2){

        int temp= ar[index1];
        ar[index1] = ar[index2];
        ar[index2]= temp;



    }

}
