package oops;

public class Inheritance_01 {

    public static void main(String[] args) {

        child1 c1 = new child1();
        c1.disp();
    }
}
  class Parent{
        public void disp(){
            System.out.println("hello");

        }
  }

class child1 extends Parent{

}
class child2 extends Parent{


}