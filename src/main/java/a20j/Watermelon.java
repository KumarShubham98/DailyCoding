package a20j;
import  java.util.Scanner;
public class Watermelon {
    public static void main(String[] args){
       int c;
        Scanner scan = new Scanner(System.in);
        System.out.println("input: ");
        int a = scan.nextInt();

        if(a>=1&&a<=100){
            if(a%2==0){
                c= a/2;
                System.out.println("yes"+"\n"+c+" "+c);
            }
        }else{
            System.out.println("Invalid Input");
        }
    }
}
