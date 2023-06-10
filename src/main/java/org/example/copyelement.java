package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class copyelement {
    public static void main(String[] args)
    {
        // Create destination list
        List<String> destination_List = new ArrayList<>();
        // Add elements
        destination_List.add("Shoes");
        destination_List.add("Toys");
        destination_List.add("Horse");

        System.out.println(destination_List);
        destination_List.add("Tiger");

        System.out.println( "The Original Destination list is ");
        for (int i = 0; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(i) + " ");
        }
        System.out.println();
        // Create source list
        List<String> source_List = new ArrayList<>();
        // Add elements
        source_List.add("Bat");
        source_List.add("Frog");
        source_List.add("Lion");
        source_List.add("Tiger");
        source_List.add("Bear");
        // Copy the elements from source to destination
     //   Collections.copy(destination_List, source_List);
      Collections.copy(destination_List, source_List);

        // Printing the modified list
        System.out.println("The Destination List After copying is ");

        for (int i = 0; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(i) + " ");
        }

        for (int i = 1; i < destination_List.size(); i++) {
            System.out.print(destination_List.get(11) + " ");
        }

    }
}
