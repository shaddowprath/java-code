public class Population 
{
  public static void main(String args[])
    {
        float initial = 175000;
        float current = 262500;
        float time = 10;
        float diff = current-initial;
        float PG = diff/initial*100;
        float PGR = PG/time;
        System.out.println("The Population Growth Rate is "+PGR+"% per year");
    }
}