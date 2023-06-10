package oops;

import java.util.Scanner;

public class Encapsulation_01 {


    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        Bank b1 = new Bank();

        System.out.println("Please deposite:");
        int deposite = scan.nextInt();
        b1.setBalance(deposite);

        System.out.println(b1.getPrivatebalance());
        System.out.println("Please withdrwall:");
        int withdrawll = scan.nextInt();
          int total = deposite-withdrawll;
          b1.setBalance(total);
        System.out.println("bal: "+b1.getPrivatebalance());


    }
}


class Bank {

   private int privatebalance ;
    public void setBalance(int balance) {
        privatebalance = balance;
    }

    public int getPrivatebalance() {
        return privatebalance;
    }



}






//Scene 2


/* public static void main(String args[]) {
        Bank b1 = new Bank();
        b1.balance= 2089;
        System.out.println(b1.balance);
    }
}

class Bank {
   public int balance = 9000;

   // private int balance = 9000;
}
*/