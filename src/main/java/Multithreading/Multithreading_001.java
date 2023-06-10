package Multithreading;

public class Multithreading_001 {

    public static void main(String [] args) throws InterruptedException {
// single thread program
        for(int i=0;i<5;i++){
            System.out.println("writing");
            Thread.sleep(1000);
        }

        for(int i=0;i<5;i++){
            System.out.println("checking");
            Thread.sleep(1000);
        }
        for(int i=0;i<5;i++){
            System.out.println("saving");
            Thread.sleep(1000);
        }

    }
}
