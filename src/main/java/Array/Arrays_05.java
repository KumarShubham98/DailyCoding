package Array;

public class Arrays_05 {
//2. Write a Java program to sum values of an array.
 /*   public static void main(String args[]) {

        int arr[] ={6,7,4,9};
        int sum=0;
        for(int i=0;i<4;i++){
             sum =sum+arr[i];
        }
        System.out.println(sum);
        }*/
//3. Write a Java program to print the following grid.

 /*         - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -
            - - - - - - - - - -*/

  /*  public static void main(String args[]) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("- ");

            }

            System.out.println();


        }
    }*/


  //  4. Write a Java program to calculate the average value of array elements.
/*
    public static void main(String args[]) {

        int arr[] = {20, 30, 25, 35, -16, 60, -100};
        int avg=0;
        int sum=0;

        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        avg= sum/ arr.length;
        System.out.println(avg);
    }

   */
    //5. Write a Java program to test if an array contains a specific value.

    public static void main(String args[]) {

       int arrr[] = {20, 30, 25, 35};

        int target =20;

        System.out.println(check(arrr,target));
    /*    for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                System.out.println("true"+" "+arr[i]);
            }

        }*/


    }


    public static boolean check(int[] arr,int target){


        for (int i:arr){
            if(i==target){
                return true;
            }

        }


        return false;

    }

}