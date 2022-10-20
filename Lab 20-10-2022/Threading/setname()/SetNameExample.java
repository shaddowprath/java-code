public class SetNameExample extends Thread  
{    
    public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {    
        // creating two threads  
        SetNameExample t1=new SetNameExample();    
        SetNameExample t2=new SetNameExample();    
        // start of thread   
        t1.start();    
        t2.start();       
        // change the thread name   
        t1.setName("Prathamesh Khandait");    
        t2.setName("javatpoint");  
        // print the thread after changing   
        System.out.println("After changing name of t1: "+t1.getName());  
        System.out.println("After changing name of t2: "+t2.getName());  
    }    
}  