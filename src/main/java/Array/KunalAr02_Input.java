package Array;

import java.util.Arrays;
import java.util.Scanner;

public class KunalAr02_Input {


    public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
//   int[]  arr = new int[5];
   //************** this was the array of primitives*************
   //input using for loops

   /*     for(int i=0;i<arr.length;i++){
            arr[i]= scan.nextInt();
        }
// there are 2 ways to print
        System.out.println(Arrays.toString(arr)); // when u give array arr into it converts print to a string

*/

   /*     for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/

        //enhanced forloop for each loop

     /*   for(int j : arr){  // for every element in array print the element
//           datatype: reference variable in array
            System.out.println(j); // j represents element of the array
        }
*/
        //*************Array of objects****************

        String[] strr = new String[4];
        for(int i=0;i< strr.length;i++){
            strr[i] = scan.nextLine();

        }
        System.out.println(Arrays.toString(strr));

        strr[2]="manu";
        System.out.println(Arrays.toString(strr));

    }



}
