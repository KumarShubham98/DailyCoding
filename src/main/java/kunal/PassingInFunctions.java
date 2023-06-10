package kunal;

import java.util.Arrays;

public class PassingInFunctions {

    public static void main(String args[]){

//****  IMPORTANT
        // Arrays  are mutable in java. (mutable means u can change the object)
        // Strings are immutable in java.
     int [] nums = new int[]{3,4,5,12};
        System.out.println(Arrays.toString(nums));
         change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr) {

        arr[0]=99;

    }

}
