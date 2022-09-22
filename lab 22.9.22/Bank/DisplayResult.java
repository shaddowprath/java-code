class DisplayResult
  {
     int getRateOfInterest(){return 0;}
  }
 
   class SBI extends Bank{
      int getRateOfInterest(){return 5;}
  } 
 
class ICICI extends Bank{
    int getRateOfInterest(){return 6;}
}
 
class AXIS extends Bank{
    int getRateOfInterest(){return 7;}
}
 
class DisplayResult
 {
   public static void main(String[] args)
	{
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();
    System.out.println("Rate of Interest in SBI is "+s.getRateOfInterest()+"%");
    System.out.println("Rate of Interest in ICICI is "+i.getRateOfInterest()+"%");
    System.out.println("Rate of Interest in AXIS is "+a.getRateOfInterest()+"%");
}
}