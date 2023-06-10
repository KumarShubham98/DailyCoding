package kunal;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String args[]){

        int[][] a1 = {
                {11,22,33,4,5},
                {23,4,5,66,9},
                {34,45}

        };

        int t = 66;
     int[] ans = search(a1,t);
        System.out.println(Arrays.toString(ans));

    }
      static int[] search(int [][] arr, int target){

              for(int row=0; row< arr.length;row++){

                  for(int col=0;col<arr[row].length;col++){
                      if(arr[row][col]==target){
                          return new int[] {row,col};
                      }

                  }
              }
              return  new int[]{-1,-1};
      }




}
