
// Given an array of integers,return indices of the two numbers ,such that they added up to a specific target.
package APAS;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class TwoSum {


    public static void main(String[] args){
        List<String> dates = new ArrayList<String>();

       // Map<String, String> replaceSlashes = dates.replace("/","-");

   //    Consumer<Date> replaceSlashes = date -> date.replace("/","-");
     //  Function<String, String> replaceSlashes = dates -> dates.replace("-","/");
       UnaryOperator<String>  replaceSlashes = date ->date.replace("/","-");
        dates.replaceAll(replaceSlashes);

    }
}