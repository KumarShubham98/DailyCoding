package Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String [] args){

        //1. blank
       Stream<Object> emptyStream = Stream.empty();

       //2-array, object,collection
        String names[] = {"sanju","manoj"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e ->{
            System.out.println(e);
        });

        Stream<Object> streamBuilder =Stream.builder().build();



        //list set

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

        Stream<Integer> streams =list2.stream();
        streams.forEach(e ->{
            System.out.println(e);
        });

    }

}
