package Patterns;

// You can solve any problem of patterns
// how to approach
/*
1. Run the outter for loop number of times having a lines
[number of lines = number of rows = number of times outer loop
    will run]
2. Identify for every row number,
* how many colmns are there
* types of elements in column

3. What do you need to print

*/



public class Pattern_01 {

    public static void main(String args[]) {
        pattern1(4);
    }
    static void pattern1(int n){
        for (int row =1; row <= n; row++){
             // for every row, run the column
            for(int col =1; col<=row ;col++){

                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
