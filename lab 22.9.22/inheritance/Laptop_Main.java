package inheritance;
public class Laptop_Main 
{
	public static void main(String[] args)
	{
	Asus asus =new Asus();
	Aser aser=new Aser();
	System.out.println("Checing for Hierarchical Inheritance:");
	asus.battery();
	asus.display();
	System.out.println("_____________");
	aser.batteryLife();
	aser.display();
	System.out.println("_____________");
	Macbook macbook=new Macbook();
	System.out.println("Checing for Multilevel Inheritance:");
	Macbook.display();
	Macbook.feature();
	Macbook.function();		
	}
}