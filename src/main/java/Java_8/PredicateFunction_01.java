package Java_8;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunction_01 {


    public static void main(String args[]) {

        PredicateFunction_01 pf = new PredicateFunction_01();
        pf.testlength("codedecode");



//        Predicate<String> predi = s -> s.length() >= 5;
//        System.out.println("lenght of the string " + predi.test("codedecode"));
//
//    }


        //     Function<Integer, Integer> fun = i -> i * i;
        //    System.out.println("square" + fun.apply(3));
    }
    public Boolean testlength(String s) {

        if (s.length() >= 1) {
            return  true;

        } else

        return false;
    }
  //  }
}