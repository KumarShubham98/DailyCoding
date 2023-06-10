package core_java;

public class DynamicBinding {

    public static void main(String args[]) {

      Animal d = new Dog();
      d.eat();
    }
}
class Animal{
    public void eat(){
        System.out.println("eaten by animal");
    }
}

    class Dog extends Animal {
    public void eat(){

        System.out.println("hello");
    }
    }