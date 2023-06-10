package Java_8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo_01 {


    public static void main(String[] args) {
        List<Integer> arlist = new ArrayList<Integer>();

        arlist.add(22);
        arlist.add(12);
        arlist.add(2);


        List<Integer> newlist = new ArrayList<Integer>();

        newlist = arlist.stream().filter(x -> x>=15).collect(Collectors.toList());
        newlist.stream().forEach(x -> System.out.println(x));





    }




}