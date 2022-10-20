import java.util.*;
 
// Main class
// AddElementsToLinkedHashMap
class LinkedHashMap_insert{
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm1
            = new LinkedHashMap<Integer, String>();
 
        // Add mappings to Map
        // using put() method
        hm1.put(3, "khandait");
        hm1.put(2, "pramod");
        hm1.put(1, "prathamesh");
 
        // Printing mappings to the console
        System.out.println("Mappings of LinkedHashMap : "
                           + hm1);
    }
}