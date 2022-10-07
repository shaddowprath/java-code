public class Person_Main 
{

	public static void main(String[] args)
      {
		Student stud = new Student(322, "Prathamesh Khandait", 87);
		Employee emp = new Employee(541, "Anup Thakur", 41000);
		System.out.println(stud.toString());
		System.out.println(emp.toString());
	}

}