import java.lang.*; 
  
public class JoinDemo implements Runnable { 
    public void run() 
    { 
        Thread t = Thread.currentThread(); 
        System.out.println("Current thread: "
                           + t.getName()); 
  
        
        System.out.println("Is Alive? " + t.isAlive());         // checks if current thread is alive 
    } 
  
    public static void main(String args[]) throws Exception 
    { 
        Thread t = new Thread(new JoinDemo()); 
        t.start(); 
  
    
        t.join(1000);                                                 // Waits for 1000ms this thread to die. 
   
        System.out.println("\nJoining after 1000"
                           + " milliseconds: \n"); 
        System.out.println("Current thread: "
                           + t.getName()); 
  
        
        System.out.println("Is alive? " + t.isAlive());         // Checks if this thread is alive 
    } 
}