package Leetcode;

import java.util.Stack;

public class Leet_150_Evaluate_Reverse_Polish_Notation {

    public static void main(String[] args) {

        String[] tokens = new String[]{"4", "13", "5", "/", "+"};


        System.out.println(polishNotation(tokens));

    }


    public static int polishNotation(String[] tokenss) {
        int returnValue = 0;
        String operators = "+-*/";
        Stack<String> stacks = new Stack<String>();

        for (String i : tokenss) {

            if (!operators.contains(i)) {
                stacks.push(i);
            } else {
                int a = Integer.valueOf(stacks.pop());
                int b = Integer.valueOf(stacks.pop());
                switch (i) {

                    case "+":
                        stacks.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stacks.push(String.valueOf(a - b));
                        break;
                    case "*":
                        stacks.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stacks.push(String.valueOf(a / b));
                        break;
                }

            }

        }
        returnValue = Integer.valueOf(stacks.pop());

        return returnValue;
    }

}
