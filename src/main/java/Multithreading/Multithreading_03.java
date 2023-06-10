package Multithreading;

public class Multithreading_03 {

    public static void main(String args[]){

        Types t= new Types();
        Checks c = new Checks();
        Saves s = new Saves();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(s);

        t1.start();
        t2.start();
        t3.start();
    }
}



class Types implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("typing");
            try {
                Thread.sleep(100);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}

class Checks implements Runnable{

    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("checking");
            try {
                Thread.sleep(100);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
class Saves implements Runnable{

    public void run() {

        for(int i=0;i<5;i++){
            System.out.println("saving");
            try {
                Thread.sleep(0);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}