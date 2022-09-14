import java.util.Scanner;
public class PerfectNumber 
{  
   public static void main(String[] args) 
   {  
      
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the first number: ");  
       int num1 = sc.nextInt(); 
       System.out.println("Enter the second number: ");  
       int num2 = sc.nextInt(); 
       System.out.println("Perfect numbers within the given range are: ");   
       for(int i=num1;i<=num2;i++)
       {      
           if(checkPerfect(i))
           System.out.print(i+" ");
       }
   }       
  
           static boolean checkPerfect(int num)
   {
  
    int sum = 0,i=1;
    while(i<num)
    {
        if(num % i == 0)
        {
            sum = sum + i;
        }
        i++;
    }
    if(sum == num)
       return true;
       
    return false;    
  } 
} 