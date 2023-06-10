package Java_8;

import java.util.function.Function;

public class FunctionalChaning {


    public static void main(String args[]) {


        Function<Integer,Integer> square = i -> i*2;
        System.out.println("multiply with 2 number"+ square.apply(3));


        Function<Integer,Integer> cuba = i -> i*i*i;
        System.out.println("multiply with 2 number"+ cuba.apply(3));


        System.out.println("square it then cube it"+ square.andThen(cuba).apply(3));
        System.out.println("cube it than square it"+ square.compose(cuba).apply(3));

    }
    }
