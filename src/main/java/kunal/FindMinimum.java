package kunal;

public class FindMinimum {

    public static  void main(String [] agrs){

       int arr1[] ={13,2,3,33,4,55};

        System.out.println(min(arr1));
    }



    static int min(int[] arr){
        int minimum = arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]<minimum){

              minimum= arr[i];

            }

        }
        return minimum;
    }
}
