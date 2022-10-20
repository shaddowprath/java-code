import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_Poll
  {
       public static void main(String args[]) 
       {
          Queue<String> queue = new LinkedList<String>();
          queue.add("Java");
          queue.add("JavaFX");
          queue.add("OpenCV");
          queue.add("Coffee Script");
          queue.add("HBase");
          System.out.println("Element at the top of the queue: "+queue.poll());
          Iterator<String> it = queue.iterator();
          System.out.println("Contents of the queue: ");
          while(it.hasNext())
         {
           System.out.println(it.next());
         }
      }
}