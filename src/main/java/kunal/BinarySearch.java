package kunal;

public class BinarySearch {


    public static void main(String[] args) {


        int[] arr1 = new int[]{1, 5, 6, 9,33,444,33};

        int h = arr1.length-1;
        int l = 0;
        int m = (l + h)/ 2;
        int target =444;

          int result= binary(arr1,target,l,m,h);
        System.out.println(result);
    }


    static int binary(int[] arr, int target1, int l, int m, int h) {
        while (l <= h) {
            m = (l + h) / 2;

            if (arr[m] == target1) {

                return m;
            }

            if (target1 > arr[m]) {
                l = m + 1;
            } else
                h = m - 1;

        }


        return -1;
    }
}
