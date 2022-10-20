public class GetName extends Thread  
{    
    public void run()  
    {    
        System.out.println("Thread is running...");    
    }    
    public static void main(String args[])  
    {   
        // creating two threads   
        GetName t1=new GetName();    
        GetName t2=new GetName();    
        // return the name of threads  
        System.out.println("Name of t1: "+ t1.getName());    
        System.out.println("Name of t2: "+t2.getName());    
        // start t1  and t2 threads   
        t1.start();    
        t2.start();    
    }    
}  