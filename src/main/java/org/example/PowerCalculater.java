

/*Power Calculator
Create a function that takes voltage and current and returns the calculated power.

Examples
power(230, 10) ➞ 2300

power(110, 3) ➞ 330

power(480, 20) ➞ 9600
*/
package org.example;


import java.util.Scanner;

public class PowerCalculater {

    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter voltage:");
        int voltage = scan.nextInt();
        System.out.println("enter current:");
        int current = scan.nextInt();
        int p = voltage * current;
        System.out.println(p);



    }
}