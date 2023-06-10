import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Employee {



    public static void main(String[] args) {

     List<String> list =new ArrayList<>();

        list.add("abc");
        list.add("tony");
        list.add("sam");
        list.add("ram");
       /* List<Integer> list =new ArrayList<>();

        list.add(44);
        list.add(56);
        list.add(3);
        list.add(31);
        list.add(44);
        list.add(56);
*/
      //  for (int n : list) {

          /*  list.sort((n1)-> System.out.println(n));
            System.out.println((i)->);
            */
      //   List newlist = list.stream().map((i)->(list.stream().collect(Collectors.toList()));

            List newlist = list.stream().collect(Collectors.toList());
          //     newlist.sort(n);

       /*     System.out.println(newlist);
              }*/
       // List newlist = list.stream().map(n1)->(list.sort(n));

                //.map((n)->(list.stream().collect(Collectors.toList())));

    //    List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");

       List<String> sortedlist = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
sortedlist.forEach(System.out::println);
       System.out.println(sortedlist);
       // List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
    //    List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
       // sortedList.forEach(System.out::println);
    }

    }

