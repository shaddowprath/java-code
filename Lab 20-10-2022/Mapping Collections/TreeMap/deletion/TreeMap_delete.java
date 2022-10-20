import java.util.*;
 
public class TreeMap_delete {
    public static void main(String[] args)
    {
 
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map = 
                   new TreeMap<Integer, String>();
 
        // Mapping string values to int keys
        tree_map.put(10, "Prathamesh");
        tree_map.put(15, "4");
        tree_map.put(20, "hello");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");
 
        // Displaying the TreeMap
        System.out.println("Initial Mappings are: " 
                                         + tree_map);
 
        // Removing the existing key mapping
        String returned_value = (String)tree_map.remove(20);
 
        // Verifying the returned value
        System.out.println("Returned value is: " +
                                        returned_value);
 
        // Displaying the new map
        System.out.println("New map is: " + tree_map);
    }
}