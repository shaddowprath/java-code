import java.util.*;
 
public class ListIterator {
   
    public static void main(String[] args)
    {
          
        List<String> names = new LinkedList<>();                                // list of names
        names.add("Hi");
        names.add("I'm");
        names.add("Prathamesh Khandait");
 
     
        ListIterator <String> listIterator                                       // Getting ListIterator
            = names.listIterator(); 
 
      
        System.out.println("Forward Direction Iteration:");                          // Traversing elements
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
 
  
        System.out.println("Backward Direction Iteration:");                    // Traversing elements, the iterator is at the end at this point
       
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}