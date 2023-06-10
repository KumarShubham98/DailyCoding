package Multithreading;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;

public class MultithreadingUsingSync_07 {
    public static void main(String[] args) throws InterruptedException {

        Bathroomm b = new Bathroomm();
        Thread t1  = new Thread(b);
        Thread t2  = new Thread(b);
        Thread t3  = new Thread(b);
        t1.setName("hulk");
        t2.setName("loki");
        t3.setName("thor");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}

class Bathroomm implements Runnable{

    @Override
    synchronized public void run() {
        try{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName +" "+"enter in bathroom");
            Thread.sleep(1000);
            System.out.println(threadName+" "+"using bathroom");
            Thread.sleep(1000);
            System.out.println(threadName+" "+"Exiting bathroom");
            Thread.sleep(1000);


        }catch(InterruptedException ex){

            ex.printStackTrace();
        }


    }
}