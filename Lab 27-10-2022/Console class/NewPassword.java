import java.io.Console;  
public class NewPassword {  
   public static void main(String[] args) {        
       String str;   
       String fmt=" ";  
       try {  
       //Obtaining a reference to the console.   
       Console con = System.console();   
          
       // Checking If there is no console available, then exit.   
       if(con == null)    
       {   
           System.out.print("No console available");   
           // console is not available. please Run code on cmd.  
           return;   
       }   
        
            // read line from the user input  
               System.out.print("Your Name: ");  
           str =con.readLine(fmt,"Your","Name: ");  
              
            // prints  
            System.out.println("Name is: " + str);  
              
            // read password into the char array  
            System.out.print("Show old password, please Enter Press:");  
            char[] pwd = con.readPassword(fmt,"Enter","Password: ");  
              
            // prints  
            System.out.println("Password is: "+pwd);  
              
            System.out.println("Update password: ");   
            char[] ch=con.readPassword();   
        
            //converting char array into string   
            String pass = String.valueOf(ch);   
            System.out.println("New Password is: " + pass);   
            }  
       catch(Exception e) {  
           System.out.println(e);  
       }  
         }     } 