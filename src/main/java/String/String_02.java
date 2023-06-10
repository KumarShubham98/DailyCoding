package String;


//How to find the maximum occurring character in a given String?
public class String_02 {

    public static void main(String args[]){

        String str ="hearee";

        char maxchar =' ';
         int maxcount= 0;

         //iterating each character in the string
         for(int i=0; i<= str.length()-1;i++) {
             char str1 = str.charAt(i);
             int count = 0;
             // Count the occurrences of the character in the string
             for (int j = 0; j <= str.length()-1; j++) {

                 if (str1 == str.charAt(j)) {
                     count++;
                 }
             }


             if (count > maxcount) {
                 maxchar = str1;
                 maxcount = count;
             }

         }


        System.out.println("Max occurring character in '" + str + "' is '" + maxchar + "'");




       /* String str = "Raamaa";
        char maxChar = ' ';
        int maxCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            // Count the occurrences of the character in the string
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            // If the count is greater than the current maximum count, update the maximum count and character
            if (count > maxCount) {
                maxChar = ch;
                maxCount = count;
            }
        }

        System.out.println("Max occurring character in '" + str + "' is '" + maxChar + "'");
  */
    }



    }