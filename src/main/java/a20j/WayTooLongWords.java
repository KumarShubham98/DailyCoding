package a20j;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WayTooLongWords {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("input n: ");
        int n = scan.nextInt();

        String arraystring = Arrays.toString(new String[4]);
     /*   for(int i =0; i<n;i++){
            arraystring  = scan.nextLine();

        }*/

        for(int i =0; i<n;i++){
            arraystring  = scan.nextLine();
            System.out.println(arraystring);
        }
    }
}





/*inputCopy
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis

outputCopy
word
l10n
i18n
p43s
*/
