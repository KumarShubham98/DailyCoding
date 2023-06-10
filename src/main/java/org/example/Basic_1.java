package org.example;
//Display Sum of n Natural Numbers
import java.util.Scanner;

/*
* 4 1 7
-2 4 -1
1 -5 -3
*
*
*
* */
public class Basic_1 {

    public static void main(String[] args) {


//        int a[][] = new int[][]{{4, 7, 2}, {-2, 4, -1}, {1, -5, -3}};
        int a[][] = new int[][]{{3,-1,7},{-5,2,-4},{2,-1,-3}};
        boolean flag = true;
        for(int i=0;i<a.length;i++ ){
            int sum = 0;
            for(int j =0 ; j<a[i].length;j++){
                sum += a[j][i];
                a[j][i]++;
            }
            if(sum == 0){
                flag = flag && true;
            }else {
                flag = false;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}




