package Array;

public class Array_09 {
    public static void main(String [] agrs){



        Student s1 = new Student("abhay",1);
        Student s2 = new Student("shubham",2);

        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s2.rollno);
        System.out.println(s2.name);

    }
}

class Student{
    String name;
    int rollno;

    public Student(String name, int rollno) {

        this.name=name;
        this.rollno=rollno;
    }

    }

