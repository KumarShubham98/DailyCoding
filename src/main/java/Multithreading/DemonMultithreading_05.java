package Multithreading;

public class DemonMultithreading_05 {

    public static void main(String args[]) {
        Coders t1 = new Coders();
        Coders t2 = new Coders();
        Coders t3 = new Coders();
        t1.setName("typing");
        t2.setName("spelling");
        t3.setName("saving");
        t2.setDaemon(true);
        t3.setDaemon(true);
        t2.setPriority(1);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Coders extends Thread {

    @Override
    public void run() {
        try {
            String t_name     = Thread.currentThread().getName();
            //String threadName = Thread.currentThread().getName();
            if(t_name.equals("typing")){
                type();
            }else if (t_name.equals("spelling")){
                spell();
            }else {
                save();
            }
        }catch (Exception ex){

            ex.printStackTrace();
        }
    }


    void type() throws InterruptedException {
        for(int i=0;i<5;i++){
            System.out.println("typing");
            Thread.sleep(1000);
        }

    }

    void spell() throws InterruptedException {
        for(int i=0;i<5;i++){
            System.out.println("spelling");
            Thread.sleep(1000);
        }
    }
    void save() throws InterruptedException {
        for(int i=0;i<5;i++){
            System.out.println("saving");
            Thread.sleep(1000);
        }
    }
}
