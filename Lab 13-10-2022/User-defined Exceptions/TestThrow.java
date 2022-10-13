class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
          
        super(str);                  // Calling constructor of parent Exception  
    }  
}  
 
public class TestThrow              // Class that uses above MyException 
{  
    public static void main(String args[])  
    {  
        try  
        {  
 
            throw new UserDefinedException("This is user-defined exception");   // throw an object of user defined exception
        }  
        catch (UserDefinedException ude)  
        {  
            System.out.println("Caught the exception");  
              
            System.out.println(ude.getMessage());         // Print the message from MyException object 
        }  
    }  
}   