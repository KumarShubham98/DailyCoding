package daily;

//write a program to find the first repeating character in the string "abaccdeff".
//write a program to find the first non-repeating character in the string "abaccdeff".
public class May13_05 {

    public static void main(String args[]) {

        String str ="abaczcadeffaffff";
        char[] ch = str.toCharArray();
        for (int i =0;i<str.length();i++){
            int count =0;
            char ct;
            for (int j =i+1;j<str.length();j++){

                if(ch[i]==str.charAt(j)){
                   count ++;
                }

            }if(count==1){
                System.out.println(ch[i]);
            }

            }

        }
    }
