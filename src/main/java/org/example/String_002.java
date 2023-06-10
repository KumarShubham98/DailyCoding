package org.example;

import java.util.ArrayList;

public class String_002 {

    public static void main(String args []){

        Company cp = new Company();
        Subcompany ss = new Subcompany();

        System.out.println(cp.getId()+ cp.getName());
        ss.disp();
        cp.disp();
        cp.disp1();
    }
}

class Company{

    public  String name="iuy";
    public  int id=67;

    public Company(String name, int id) {
        this.name = name;
        this.id = id;


    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    void  disp(){
       System.out.println("hii");
    }
    void  disp1(){
        System.out.println("hii123");
    }
    public Company() {
    }
}

class Subcompany extends Company{

    void  disp(){
        System.out.println("hello");
    }

}