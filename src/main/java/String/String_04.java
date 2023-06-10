package String;

import java.util.HashMap;
import java.util.Map;

//How to print the duplicate characters from the given String?
/*Algorithm:
The steps are as follows:

Take the string as an input.
Create a hash map of type {Character, Integer}.
Traverse the string from left to right.
If the current character is already in the hash map, increment its frequency. Else insert the character in the hash map by setting the frequency to 1.
Finally, traverse through the hashmap and search for the characters with a frequency greater than 1*/
public class String_04 {

    public static void main(String args[]){
        String str ="programming";
        char[] ca =str.toCharArray();


        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for ( char c:ca) {

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);

            }else {

                map.put(c,1);
            }
        }

        System.out.print("The duplicate characters in the string are: ");

                for(Map.Entry<Character,Integer> entry : map.entrySet()){

                    if(entry.getValue() >1){

                        System.out.println("key : "+entry.getKey()+" , "+"repeated value : "+entry.getValue() );
                    }
                }






        /*
        System.out.print("The duplicate characters in the string are: ");
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
*/
    }
}
