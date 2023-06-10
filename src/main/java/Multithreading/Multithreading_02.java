package Multithreading;

public class Multithreading_02 {

    public static void main(String args[]){

        Type t= new Type();
        Check c = new Check();
        Save s = new Save();

        t.start();
        c.start();
        s.start();
    }


}

class Type extends Thread{
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

class Check extends Thread{

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
class Save extends Thread{

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