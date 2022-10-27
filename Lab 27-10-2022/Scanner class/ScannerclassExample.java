import java.util.Scanner;  
public class ScannerclassExample 
{    
    public static void main(String args[]){       
        Scanner sc = new Scanner (System.in);  
        // Taking integer value
        int m = sc.nextInt();  
        System.out.print(m);  
        // Taking double value
        double n = sc.nextDouble();  
        System.out.print(n);
        // Taking String value
        String s = sc.nextLine();
        System.out.println(s);
        //Using this so the scanner doesn't get confused with String value and boolean value
        sc.nextLine();
        // Taking boolean value
        boolean b = sc.nextBoolean();
        System.out.println(b);  
        sc.close();  
        }   
    } 