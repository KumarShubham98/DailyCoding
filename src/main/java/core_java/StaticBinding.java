package core_java;

public class StaticBinding {

    public static void main(String args[]) {

        StaticBinding d = new StaticBinding();
        d.eat();

    }
    static void eat(){
        System.out.println("animal is eating");
    }
}



