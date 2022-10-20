import java.util.*;
 
class LinkedHashMap_update {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm
            = new LinkedHashMap<Integer, String>();
 
        // Inserting mappings into Map
        // using put() method
        hm.put(3, "Prathamesh");
        hm.put(2, "Pramod");
        hm.put(1, "Khandait");
 
        // Printing mappings to the console
        System.out.println("Initial map : " + hm);
 
        // Updating the value with key 2
        hm.put(2, "For");
 
        // Printing the updated Map
        System.out.println("Updated Map : " + hm);
    }
}