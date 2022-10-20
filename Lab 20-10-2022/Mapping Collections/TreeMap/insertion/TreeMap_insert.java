import java.util.*; 
import java.util.concurrent.*; 
  
// Main class 
// Implementation of TreeMap 
public class TreeMap_insert { 
  
    // Declaring a TreeMap 
    static TreeMap<Integer, String> tree_map; 
   // Method 
    // To Insert values in the TreeMap 
    static void insert() 
    { 
  
        // Mapping string values to int keys 
        // using put() method 
        tree_map.put(10, "hello"); 
        tree_map.put(15, "4"); 
        tree_map.put(20, "hi"); 
        tree_map.put(25, "Welcomes"); 
        tree_map.put(30, "You"); 
  
        // Display message only 
        System.out.println("\nElements successfully"
                           + " inserted in the TreeMap"); 
    } 
// Main driver method 
    public static void main(String[] args) 
    { 
  
        // Calling above defined methods inside main() 
  
       
        // Inserting the values in the TreeMap 
        insert(); 
  
        
    } 
}
  