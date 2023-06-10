package BackenedCode;

import java.util.Scanner;

public class encapsulation {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);


        int dep = scan.nextInt();
        Bank b = new Bank();

        System.out.println(b.bal);


    }

}
    class Bank{

       public  int bal =3000;


        }





