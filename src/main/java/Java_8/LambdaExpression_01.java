package Java_8;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.*;
/*This is a functional interface and can therefore be used as
the assignment target for a lambda expression or method reference.*/
public class LambdaExpression_01 {

    public static void main(String[] args) {

//        LambdaExpression_01 lm = new LambdaExpression_01();
//        lm.add(1,2);


        //   BiConsumer<Integer ,Integer> biConsumer = (a,b) -> System.out.println(a+b);
        // functional interface is used as referenced of the lambda expression
        // lexp is reference by fi.
        // biConsumer.accept(1,2);


        BiConsumer<Integer, Integer>   biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(33,44);



    /*    ArrayList<String> list = new ArrayList();

        list.add("ab");
        list.add("cd");
        list.add("ef");

        list.forEach((n) -> { System.out.println(n) });

list.forEach((n)-> {System.out.println(n) })


        for (String i : list) {

            System.out.println(list);
        }


        Consumer<String> con = (n) -> {
            System.out.println(n);
        };

        list.forEach(con);*/

/*Lambda expressions can be stored in variables if the variable's type is an interface
which has only one method. The lambda expression should have the same number of parameters and the same
 return type as that method. Java has many of these kinds of interfaces built in,
such as the Consumer interface (found in the java.util package) used by lists.*/



        }
        

    }


//   public void add(int a, int b){
//       System.out.println(a+b);
//    }
















