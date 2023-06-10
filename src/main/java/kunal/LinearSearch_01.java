package kunal;

import java.util.Arrays;

public class LinearSearch_01 {

    public static void main(String args[]) {
        int[] ar1 = new int[]{11,22,33,44,55};
        int t1 = 22;
        System.out.println(Arrays.toString(ar1));

       int result = linearSearch(ar1,t1);
        System.out.println(result);

    }

    static int linearSearch(int[] arr , int target) {
        if (arr.length == 0) {
            return -1;
        }
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
               return  i;
            }
        }*/
// for each method
        for(int sk : arr){

            if(sk==target){
                return sk;
            }
        }



        // enhanced for loop for each
        return -1;
    }

}
