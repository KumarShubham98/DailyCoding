package Java_8;

public class ImplementInterface_02 implements InterfaceWithStatic{

public static void main(String args[]){


    ImplementInterface_02  iii = new ImplementInterface_02();
    //iii.disp1(); // static method is undefined for implementing class

  InterfaceWithStatic.disp1();

}

}
