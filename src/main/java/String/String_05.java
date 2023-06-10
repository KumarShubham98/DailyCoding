package String;

public class String_05 {


    /*  public void print(Integer i) {
          System.out.println("Integer");
      }

 public void print(int i) {
          System.out.println("int");   //1
      }
    public void print(double i) {
        System.out.println("double");
    }

      public void print(long i) {
          System.out.println("long");
      }

      public static void main(String args[]) {
          String_05 test = new String_05();
          test.print(10);
      }*/
    /*public static void main(String args[]) {
        String s1 = "hello";
        String s2 = new String("hello");

        s2 = s2.intern();
        System.out.println(s1 == s2); // false
    }*/

/*
    public static void main(String[] args) {
        Derived b = new DeriDerived();
    }

}

class Base {
    public Base() {
        System.out.println("Base");
    }
}
    class Derived extends Base {
        public Derived() {
            System.out.println("Derived");
        }
    }

    class DeriDerived extends Derived {
        public DeriDerived() {
            System.out.println("DeriDerived");
        }
    }*/


    public static void foo(Integer i) {
        System.out.println("foo(Integer)");   //3
    }
    public static void foo(double i) {
        System.out.println("foo(double)");    //2
    }

    public static void foo(short i) {
        System.out.println("foo(short)");
    }

    public static void foo(long i) {
        System.out.println("foo(long)");   //1
    }

    public static void foo(int... i) {
        System.out.println("foo(int ...)");   //4
    }

    public static void main(String[] args) {
        foo(10);
    }
}

