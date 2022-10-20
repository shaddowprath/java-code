import java.util.*;
public class LinkedHashMap_delete {
   public static void main(String[] args) {
      LinkedHashMap<String,String> l = new LinkedHashMap<String,String>();
      l.put("1", "Jack");
      l.put("2", "Tom");
      l.put("3", "Jimmy");
      l.put("4", "Morgan");
      l.put("5", "Tim");
      l.put("6", "Brad");
      System.out.println("LinkedHashMap elements...
"+l);
      // Remove an element
      Object ob = l.remove("2");
      System.out.println("
LinkedHashMap elements after removing an element...
"+l);
   }
}