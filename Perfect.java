class Perfect
{
     static boolean checkPerfect(int n)
     {
       int sum=0;

       for(int i=1; i<n ; i++)
       {
                  if( n % i == 0)
                  {
                     sum= sum + i;
                  }
        }
 
     if(n == sum) return true; return false;
     }

     public static void main(String args[])
     {
       if (checkPerfect(28) == true)
              {
                System.out.println( "Okk" );
              }
      }
}