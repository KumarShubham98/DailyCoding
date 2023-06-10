package Array;

public class Array_06 {

    //6. Write a Java program to find the index of an array element.
    public static void main(String args[]) {

      /*  int arr[] ={6,7,4,9,3,4,3};
        int t=9;


        for(int i=0;i<arr.length;i++){
                if(arr[i]==t){
                    System.out.println(i);
                }

        }*/
         // 7. Write a Java program to remove a specific element from an array.
         // 8. Write a Java program to copy an array by iterating the array.

        int arr[] ={6,7,4,9,3,4,3};
        int t=9;
        int remove=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                arr[i]= 0;
            }

        }

        for(int j=0;j<arr.length;j++){

            System.out.println(arr[j]);
        }

    }
}