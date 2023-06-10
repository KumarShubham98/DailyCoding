package kunal;

import java.util.Arrays;

public class ceiling {

    public static void main(String[] args) {

    int[] ar={2,3,5,9,14,16,18};
  int target=15;

   int res = ceiling(ar,target);

        System.out.println(Arrays.toString(ar));
        System.out.println(res);
    }

    // return the index of smallest no >=target
   static int ceiling(int[] arr, int target){

        // but what if the target is greater than the greatest number in the array
   if(target > arr[arr.length-1]){
       return -1;
   }

        int start =0;
        int end= arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

           if(arr[mid] == target){
               return mid;
           }

          if( target> arr[mid]){
              start = mid+1;
          }else{

              end =mid-1;
          }


        }

        return start;

   }





}


