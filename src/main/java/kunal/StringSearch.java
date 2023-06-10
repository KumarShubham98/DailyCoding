package kunal;

import java.util.Arrays;

public class StringSearch {

    public static void main(String[] args){

      String name = "shubham";
      char target = 'm';
        System.out.println(stringSearch(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }


      static Boolean stringSearch(String str2 , char target1){

        if(str2.length()==0){
            return  false;
        }

     /*   for(int i=0;i<str2.length();i++){
            if(target1 == str2.charAt(i) ){
                return true;

            }*/

          for ( char ch : str2.toCharArray()) {
                if(ch== target1){

                    return true;
                }
          }
          return false;
        }


      }

