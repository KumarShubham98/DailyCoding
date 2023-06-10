import java.util.Scanner;
import java.util.Set;

public class practice_001 {

    public static void main(String args[]) {

//        String sentence = "T    his is b  ett     er.";
//        System.out.println("Original sentence: " + sentence);

//        sentence = sentence.replaceAll("\\s","");
//        System.out.println("After replacement: " + sentence);

            int low = 9999, high = 999999;

            for (int number = low + 1; number < high; ++number) {

                if (checkArmstrong(number))
                    System.out.print(number + " ");
            }
        }

        public static boolean checkArmstrong (int num){
            int digits = 0;
            int result = 0;
            int originalNumber = num;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }
            originalNumber = num;
            // result contains sum of nth power of its digits

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == num)
                return true;
            return false;

        }
    }


