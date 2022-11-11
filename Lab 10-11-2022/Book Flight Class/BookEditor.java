import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
public class BookEditor{
    

	public static void main(String[] args) {
        /*
         2)When enter the Book Flightwithbookid,flightid,class,date of jounrey,date of booking,number of adults,number of
            childs,gender,ticketfare and customer id details to input and print with setter and getter methods?
         */
        Scanner sc = new Scanner(System.in);
        CustomerDetails cd = new CustomerDetails();
        BookEditor be =new BookEditor();
        System.out.println("Enter booking id: ");
        cd.setBookid(sc.nextInt());
        System.out.println("Enter Flight Id: ");
        cd.setFlightid(sc.nextInt());
        System.out.println("Enter the AirClass: ");
        cd.setAirclass(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter the DateOf the Journey: ");
        cd.setDateOfJourney(sc.nextLine());
        System.out.println("Enter the DateOf the Booking: ");
        cd.setDateOfBooking(sc.nextLine());
        System.out.println("Enter the Number Of Adults attending the flight: ");
        cd.setNoOfAdults(sc.nextInt());
        System.out.println("Enter the Number Of Children attending the flight: ");
        cd.setNoOfChildren(sc.nextInt());
        System.out.println("Enter your Gender: ");
        cd.setGender(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter the ticket fare (Fees): ");    
        cd.setTicketFare(sc.nextInt());
        System.out.println("Enter your Customer Id: ");
        cd.setCustomerId(sc.nextInt());
        sc.close();
        
        // This is for to Print all the data inputted by the User
        System.out.println("The details printed are: ");
        System.out.println("Booking id is: "+ cd.getBookid());
        System.out.println("Flight id is: "+ cd.getFlightid());
        System.out.println("Air class is: "+ cd.getAirclass());
        System.out.println("DateOfJourney is: "+ cd.getDateOfJourney());
        System.out.println("DateOfBooking is: "+ cd.getDateOfBooking());
        System.out.println("NoOfAdults is: "+ cd.getNoOfAdults());
        System.out.println("NoOfChildren is: "+ cd.getNoOfChildren());
        System.out.println("Gender is: "+ cd.getGender());
        System.out.println("Ticket fare is: "+ cd.getTicketFare());
        System.out.println("Customer Id is: "+ cd.getCustomerId());

         /*
         3)Once user create Book Flight those details to store in Collections?
         */
        
        
        
        ArrayList< CustomerDetails> al = new ArrayList< CustomerDetails>();
       al.add(cd.CustomerDetails);
     
       java.util.Iterator<CustomerDetails> it = al.iterator();
       while(it.hasNext())
       System.out.println(it.next());
       
       }
    }


 class CustomerDetails {

	public static final CustomerDetails CustomerDetails = null;
	private int bookid;
	private int flightid;
	private String Airclass;
	private String dateOfJourney;
	private String dateOfBooking;
	private int NoOfAdults;
	private int NoOfChildren;
	private String Gender;
	private int ticketFare;
	private int customerId;

    public int getBookid() {
        return bookid;
    }
    public CustomerDetails CustomerDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public int getFlightid() {
        return flightid;
    }
    public void setFlightid(int flightid) {
        this.flightid = flightid;
    }
    public String getAirclass() {
        return Airclass;
    }
    public void setAirclass(String airclass) {
        Airclass = airclass;
    }
    public String getDateOfJourney() {
        return dateOfJourney;
    }
    public void setDateOfJourney(String dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }
    public String getDateOfBooking() {
        return dateOfBooking;
    }
    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }
    public int getNoOfAdults() {
        return NoOfAdults;
    }
    public void setNoOfAdults(int noOfAdults) {
        NoOfAdults = noOfAdults;
    }
    public int getNoOfChildren() {
        return NoOfChildren;
    }
    public void setNoOfChildren(int noOfChildren) {
        NoOfChildren = noOfChildren;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public int getTicketFare() {
        return ticketFare;
    }
    public void setTicketFare(int ticketFare) {
        this.ticketFare = ticketFare;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}