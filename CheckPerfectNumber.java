import java.util.Scanner;
class CheckPerfectNumber
{


  //-----------COUNTING TOTOAL NUMBER OF PERFECT NUMBER--------------

	
	static void countPerfectNumber(int x, int y)
	{
		int count = 0;
		
	    for(int i = x; i<=y;i++)
	    {
		if (checkPerfectNumber(i) == true)
		{
		count=count+1;
		}
	    }
	System.out.println( "Total number of perfect number between " + x + " and " + y + " is : " +count);
        }

//---------CHECKING IF THE NUMBER IS PERFECT OR NOT-----------

	static boolean checkPerfectNumber(int s)
	{
	int sum=0;
	
	for(int i = 1; i<s ; i++)
	{
		if(s%i==0)
		{
		sum = sum+i;
		}
	}
	if(s==sum)
	return true;
	return false;
	}

//-------------CALCULATING LOWEST NUMBER--------------	
 
 	static int lowest(int x, int y)
	{
		if(x==y)
		{
		return x;
		}
	
		else if(x>y)
		{
		return y;
		}
	
		else
		{
		return x;
		}
	}

//-----------CALCULATING GREATEST NUMBER--------------
	
	static int greatest(int x, int y)
	{
		if(x==y)
		{
		return x;
		}
	
		else if(x>y)
		{
		return x;
		}
	
		else
		{
		return y;
		}
	}

//---------MAIN METHOD STARTS FROM HERE-------------

	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);            //TAKING USER INPUT
        System.out.print( " Enter two number :" + " ");

	int a = sc.nextInt();
	int b = sc.nextInt();

	int ll = lowest(a,b);
	int ul = greatest(a,b);
	
	countPerfectNumber(ll, ul);
	}


}