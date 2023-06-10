package Java_8;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo_02 {

    public static  void main(String [] args){
      //  List<Integer> list1 = List.of(1,2,3,4);

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

// with out stream
     /*   List<Integer> list3 = new ArrayList<Integer>();

        for (Integer i:list2) {
            if(i%2==0){
               list3.add(i);

            }
        }
        System.out.println("list 1"+ list2 );
        System.out.println(list3);*/

  // using stream

     //   List<Integer> newlist = new ArrayList<>();

    /*    newlist= list2.stream().filter(i->i%2==0).collect(Collectors.toList());
        newlist.stream().forEach(i->System.out.println(i));
*/

       Stream<Integer> streams = list2.stream();
      List<Integer>  newlist =streams.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newlist);
    }
}
