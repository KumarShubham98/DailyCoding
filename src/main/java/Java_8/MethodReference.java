package Java_8;

public class MethodReference {

    public static void main(String args[]){


       // if no testImplementation is available in existing code base then use code for lambda exp;
//        FunctionalInterface_01 functionalInterface01 = () -> System.out.println("hkm");
//        functionalInterface01.singlemethod();

FunctionalInterface_01 functionalInterface01 = Test2 ::testimplementation;
functionalInterface01.singlemethod();

    }

}



class Test{


}
class Test1{


}
class Test2{

public static void testimplementation(){

    System.out.println("Hari bol!!!");
}

}