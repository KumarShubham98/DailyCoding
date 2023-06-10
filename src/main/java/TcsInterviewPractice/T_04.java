package TcsInterviewPractice;

public class T_04 {

    public static void main(String args[]) {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = new String("HELLOyt");
        String s4 = new String("HELLO");
        System.out.println(s3 == s4); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3.equals(s4)); // true
     //   System.out.println(s1.equals(s3)); // true
    }
}