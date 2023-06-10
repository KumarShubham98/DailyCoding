package Array;


// Why we need array
public class Kunal_Array_01 {

    public static void main(String args[]){
        // store a roll number
        int a = 22;
        // Store a name
        String name="krishna";

        //q store 5 rollnumber     ('we will not use the variable approach , will use array approach')
        //syntax
        //datatype[]  variablename = new datatype[size];
        //store 5  roll numbers
        int[] arr = new int[5];
  //or directly
       //int [] arr1= {1,2,34,4}; //  this arr1 reference variable pointing to a array object.

        int[] ros;  // declaration of an array. arr2 is getting to define in the stack // happen in compile time

        ros = new int[5];  // initialisation : actually object will create in the heap segment. // happen in runtime{it is dynamic memory allocation'memory '->'at the runtime memory is allocated'}
      //  System.out.println(ros[1]);
       // internal working of array
        /*
        1.1 new keyword is used to create objects.
        1. array object are in heap.
        2. heap objects or heap area are not continous.
        3. dynamic memory allocation.
        4. array objects in java may not continous.(but in java internally may not be continous'beacs it depends on jvm' )
        5. for all the integers array by default all the element 0 in it.
        6.
         */
        // try string array of default element is null


        String[] st = new String[4];
        System.out.println(st[2]);

        // null is by default value of any reference type.
        // null is special value it is not a object not a type which can assign any reference type.
        // primitive types store in stack memory
        // non primitive type, object store in heap memory

        // each particular element is a object in heap when string object is present


        /*   very important java does not have continous memory allocation
        Difference between primitive and objects
        primitives are int char,float and boolean
        non primitives datatypes are complex datatypes, string can be broken into char....


         */

    }
}
