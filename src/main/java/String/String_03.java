package String;
//How to remove all duplicates from a given string?
public class String_03 {

    public static void main(String[] args) {

        String str = "programming";
    StringBuilder  sb1 =new StringBuilder();
    str.chars().distinct().forEach(c -> sb1.append((char)c));
    System.out.println(sb1);
    }


    }

