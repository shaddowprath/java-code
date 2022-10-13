

public class NestedTryblock {

	
	public static void main(String[] args) {
		
		//Outer try
		try{    
			String name = null;
			//Inner try
	        try
	        {
	        	if (name.equals("Prathamesh"))
	                System.out.print("Same");
	            else
	                System.out.print("Not Same");
	        }
	        //Inner catch
	        catch(NullPointerException e)
	        {
	            System.out.print("Sorry you can't put the variable value to null");
	        }
			    
			    //inner Try block   
				    try{    
				    int a[]=new int[5];    
				     a[5]=4;    
				     }
				    //  inner catch 
				    catch(ArrayIndexOutOfBoundsException e)  
				    {  
				       System.out.println(e);  
				    }    
				  
				    System.out.println("Sorry the index is not available");    
				  }  
			  //Outer catch block 
			  catch(Exception e)  
			  {  
			    System.out.println("handled the exception (outer catch)");  
			  }    
			    
			  System.out.println("The rest of the code");    
			 }    

	}