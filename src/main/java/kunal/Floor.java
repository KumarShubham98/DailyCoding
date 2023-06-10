package kunal;

public class Floor {

    public static void main(String[] args) {

        int[] ar = {2, 3, 5, 9, 14, 16, 18};

        int target = 15;
        int res = floor(ar, target);
        System.out.println(res);
    }


    // return the index: greatest number <= target
    static int floor(int[] arr, int target){

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

        return end;

    }

}