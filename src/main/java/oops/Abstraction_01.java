package oops;

public class Abstraction_01 {


    public static void main(String args[]) {


        Train t1 = new Train1();
        track(t1);
        Train t2 = new Train2();
        track(t2);
    }



    public static void track(Train t){

        t.disp();
        t.disp2();
    }
}

 abstract class Train{
    abstract void disp();
     abstract void disp2();
}

class Train1 extends Train{

    public void disp(){
        System.out.println("hare");
    }

    @Override
    void disp2() {
        System.out.println("banke");
    }

    ;
}
class Train2 extends  Train{

    public void disp(){
        System.out.println("krishna");
    }

    @Override
    void disp2() {

        System.out.println("bihari");
    }

    ;

}