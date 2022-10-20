import java.util.*; 
  
// Main class 
class TreeMap_update{ 
  
    // Main driver method 
    public static void main(String args[]) 
    { 
        // Initialization of a TreeMap 
        // using Generics 
        TreeMap<Integer, String> tm 
            = new TreeMap<Integer, String>(); 
  
        // Inserting the elements in Map 
        // using put() method 
        tm.put(3, "Pramod"); 
        tm.put(2, "Prathamesh"); 
        tm.put(1, "Khandait"); 
  
        // Print all current elements in map 
        System.out.println(tm); 
  
        // Inserting the element at specified 
        // corresponding to specified key 
        tm.put(2, "For"); 
  
        // Printing the updated elements of Map 
        System.out.println(tm); 
    } 
}
Output: 