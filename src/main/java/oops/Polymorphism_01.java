package oops;

public class Polymorphism_01 {

    public static void main(String args[]){


        Teacher  t1 = new Teacher1();
       tech(t1);
        Teacher  t2 = new Teacher2();
       tech(t2);


    }

    public static void tech(Teacher t){

        t.teach();
    }


}

class Teacher {
    public void teach(){};
}


class Teacher1 extends Teacher {
    public void teach(){
        System.out.println("teacher1  is teaching ");
    }
}

class Teacher2 extends Teacher{
    public void teach(){
        System.out.println("teacher2  is teaching ");
    }
}