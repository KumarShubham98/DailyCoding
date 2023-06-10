package Java_8;

@FunctionalInterface
public interface FunctionalInterface_01 {


    abstract void singlemethod();

     default void  disp1(){

         System.out.println("hello");
    }
    default void  disp2(){

        System.out.println("hello");
    }
}
