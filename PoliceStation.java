class PoliceStation
{
        void Area(int pincode)
        {
            System.out.println(pincode);
        }
       
       void Area(int pincode, String police_s)
       {
          System.out.println(pincode);
          System.out.println(police_s);
       }
   
       void Area(int pincode, String police_s, String city)
       {
          System.out.println(pincode);
          System.out.println(police_s);
          System.out.println(city);
       }
   
      public static void main(String [] args)
      {
              java.util.Scanner scan=new java.util.Scanner(System.in);
              System.out.println("How many data want to enter: ");           
              int num_data = scan.nextInt();

         PoliceStation ps1=new PoliceStation();
        
      switch(num_data)
     {
         case 1:
                ps1.Area(421301);
                break;

         case 2:
                ps1.Area(421301, "Adharwadi");
                break;

         case 3:
                ps1.Area(421301, "Adharwadi", "Kalyan" );
                break;
      
         default:
                System.out.print("Invalid input");
     }
 }
}
