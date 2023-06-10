package Array;

import java.util.Arrays;

public class Array_07 {

    public static void main(String[] args) {

        int[] arr= {1, 2, 5, 5, 8, 9, 7, 10};

      //  int arr.length = arr.length;
        int n = arr.length;

        //Comparing each element with all other elements

        for (int i = 0; i < arr.length; i++)
        {
          for (int j = i+1; j < arr.length; j++)
            {
                // If any two elements are found equal
                if(arr[i] == arr[j])
                {
              // Replace duplicate element with last unique element.
                    arr[j] = arr[arr.length-1];
                    n--;
                    j--;

                }
            }
        }

     /*   for (int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
*/
        System.out.println(Arrays.toString(arr));

    }

}

































/* L1
for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){

                 if(arr[i]>arr[j]){
                     int temp= arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }

             }

         }
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }
*/






/* L2
  int sum =0;

         for(int i=0;i<arr.length;i++){

            sum = sum+arr[i];
             }

        System.out.println(sum);
         }*/





/* L3
for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length;j++){
                 System.out.print("- ");

               }
             System.out.println();
             }
*/



/* L7
int arr[] = {1,12,3,34,13};
        int remove_index=2;
        System.out.println("before removing the second element: "+ Arrays.toString(arr));

         for(int i=remove_index;i<arr.length-1;i++){
                 arr[i]=arr[i+1];

             }

// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
        System.out.println("After removing the second element: "+ Arrays.toString(arr));

         }*/

/*L9
int max=arr[0];
         for(int i=0;i<=arr.length-1;i++){

             if(max>arr[i]){

                 max=arr[i];
             }

             }

        System.out.println(max);*/



/*  L11
  int arr[] = {1, 12, 3, 34, 13};
        int arr1[]= new int[arr.length];
        System.out.println(arr.length);
        int j = arr.length-1;

        for (int i = 0; i <= arr.length-1; i++) {

            arr1[j] = arr[i];
            j--;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
*/




/*
L11
 int arr[] = {25, 14, 56, 15, 36,};

        int index_position= 1;
        int insert_value= 14;
        for (int i = arr.length-1; i > index_position; i--) {

            arr[i] =arr[i-1];

        }
        arr[index_position] = insert_value;
        System.out.println("New Array: "+Arrays.toString(arr));
*/


/*L12
 int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++){

                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }*/

/* L14
int[] arr= {1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 = {1, 0, 6, 15, 6, 4, 7, 0};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr2.length; j++){

                if(arr[i]==arr2[j]){
                    System.out.println(arr2[j]);
                }
            }*/