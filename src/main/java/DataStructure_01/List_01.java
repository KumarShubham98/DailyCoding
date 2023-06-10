package DataStructure_01;

import java.util.*;
import java.util.stream.Collectors;

public class List_01 {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9,8,1,1,1,1,1, 1, 6, 4);

        /*Collections.sort(numbers);
        System.out.println(numbers);
*/
        Set<Integer> set1 = new HashSet<>(numbers);
        System.out.println(set1);
        numbers.clear();
        System.out.println(numbers);

       /* Collections.sort(numbers);
        List<Integer> numbers1 =  numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(numbers1);*/

     //   HashSet<Integer> uniquelist = new HashSet<>(numbers);
      //  System.out.println(uniquelist);

       // System.out.println(numbers);

      /*  numbers.clear();
        numbers.addAll(uniquelist);
        System.out.println(numbers);*/

    }


//
//    public static void main(String args[]) {
//
//        int secondMax=0;
//        int max =0;
//        int thirdMax=0;
//        List<Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(12);
//        list.add(13);
//        list.add(14);
//        list.add(15);
//
//        for (int num : list) {
//            if(num> max){
//                secondMax=max;
//                max=num;
//            }
//
//            else if (num>secondMax && num< max){
//
//                secondMax=num;
//            }
//
//
//
//            if (num > secondMax){
//                thirdMax =secondMax;
//                secondMax=num;
//
//            }  else if (num>thirdMax && num< secondMax){
//
//                thirdMax=secondMax;
//            }
//        }
//
//        System.out.println(secondMax);
//        System.out.println(max);
//        System.out.println(thirdMax);
    }
/*
    public static  int findsecondLargestNumber(List<Integer> list) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : list) {

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }


        return secondMax;

    }*/
