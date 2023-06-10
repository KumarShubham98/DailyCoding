package DataStructure_01;

import java.util.*;
import java.util.stream.Collectors;

public class FIndNthLargest {

    public static void main(String args[]) {

        List<Integer> numbers = Arrays.asList(5,4,3,6);  // 1,2,3,4,5,6
        int n = 1;

        int LargestNumber = findLargestNumber(numbers, n);
        System.out.println(LargestNumber);

    }



    public static int findLargestNumber(List<Integer> numbers, int n) {

        if (numbers.isEmpty() || n <= 0 || n > numbers.size()) {
            throw new IllegalArgumentException("Invalid input");
        }
        //System.out.println(numbers.size());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    //    System.out.println(minHeap);
     //   System.out.println(minHeap.size()+"size of minHeap");

        for (int num : numbers) {
            minHeap.offer(num);
            //System.out.println(minHeap);
            if(minHeap.size()>n){          //0>1 false  1>1 false  2>1 true
                minHeap.poll();
            //    System.out.println(minHeap);
            }

        }
        return minHeap.peek();
    }



   /* public static int findLargestNumber(List<Integer> numbers, int n) {


        if(numbers.isEmpty()|| n<=0|| n>numbers.size()){
            throw new IllegalArgumentException("Invalid input");
        }


       *//* Collections.sort(numbers);
        return numbers.get(n-1);*//*

        List<Integer>  listInDesc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listInDesc);
        return numbers.get(n);
    }*/
    }
