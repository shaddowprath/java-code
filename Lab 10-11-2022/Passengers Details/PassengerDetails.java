import java.util.ArrayList;
public class PassengerDetails{
    public static void main(String[] args) {
        /*
        5)To add new passenger details,delete passenger details and print passenger details with bookid? 
        */
        BookPassenger b1 = new BookPassenger(12, 1, "Prathamesh",24, true);
        BookPassenger b2 = new BookPassenger(13, 2, "Pramod",30, false);
        BookPassenger b3 = new BookPassenger(14, 3, "Khandait",36, false);
        b1.CustomerDetails();
        b2.CustomerDetails();
        b3.CustomerDetails();
        
        ArrayList<BookPassenger> al = new ArrayList<BookPassenger>();
        // Adding it to collection
        al.add(b1);
        al.add(b2);
        al.add(b3);
        // Removing one element
        al.remove(b3);
        for(BookPassenger b: al){
            System.out.println("");
            b.CustomerDetails();
        }
    }
}
/*
 4)To create Passenger details with bookid,passengerid,pname,age,booking status details to input and print with setter and getter methods?
 */
class BookPassenger{
    public BookPassenger(int i, int j, String string, int k, boolean b) {
        bookid = i;
        passengerId = j;
        Pname = string;
        age = k;
        bookingstatus = b;
    }
    public int getBookid() {
        return bookid;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public int getPassengerId() {
        return passengerId;
    }
    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
    public String getPname() {
        return Pname;
    }
    public void setPname(String pname) {
        Pname = pname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isBookingstatus() {
        return bookingstatus;
    }
    
    public void setBookingstatus(boolean bookingstatus) {
        this.bookingstatus = bookingstatus;
    }

    private int bookid;
	private int passengerId;
	private String Pname;
	private int age;
    private boolean bookingstatus;

    
    public void CustomerDetails() {
        System.out.println("BookPassenger [bookid=" + bookid + ", passengerId=" + passengerId + ", Pname=" + Pname + ", age=" + age+ ", bookingstatus=" + bookingstatus );
    }
}