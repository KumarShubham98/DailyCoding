package kunal;

import java.util.Arrays;

public class SearchInRange {
// search for 33 int in the range of index[1,]
    public static void main(String args[]) {

        int[] ar1 = new int[]{11,22,2,33,44,55,14,28};
        int t1 = 22;
        System.out.println(Arrays.toString(ar1));

        int result = SearchInRange(ar1,t1,1,5);
        System.out.println(result);

    }

    static int SearchInRange(int[] arr , int target,int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
               return  i;
            }
        }
// for each method
       /* for(int sk : arr){

            if(sk==target){
                return sk;
            }
        }*/



        // enhanced for loop for each
        return -1;
    }
    }
