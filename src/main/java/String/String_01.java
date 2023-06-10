package String;

/*
How can you remove all the white spaces in a string?
How to find the maximum occurring character in a given String?
How to remove all duplicates from a given string?
How to print the duplicate characters from the given String?
How to remove characters from the first String which are present in the second String?
How to reverse a given String?
How do you check if a given String is Palindrome or not?*/
public class String_01 {

    public static void main(String[] args) {

        String str = "My    name is        shubham";

        char[] strArray = str.toCharArray();

        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0;i<= strArray.length-1;i++){

            if((strArray[i]!=' ')){

                stringBuffer.append(strArray[i]);

            }
        }

        String nospace = stringBuffer.toString();

        System.out.println(nospace);



        String str1 = "hi my is sk";
        String str22 = str1.replaceAll("\\s","");
        System.out.println(str22);

    }


}
