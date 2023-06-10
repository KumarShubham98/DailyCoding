package Multithreading;

public class Mthreading_01 {
//Thread is a pre-defined class in java
    public static void main(String [] args){
     Thread t1 = Thread.currentThread();
        t1.setName("krishna");
        t1.setPriority(10);
        System.out.println(t1);

        fun();
    }
    static void fun(){
        Thread t2 = Thread.currentThread();
        t2.setName("hari");
        t2.setPriority(04);
        System.out.println(t2);
    }
}
