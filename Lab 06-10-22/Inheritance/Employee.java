public class Employee extends Person {
	
	int salary;
	
	Employee(int pid, String pname, int salary) {
		super(pid, pname);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", pid=" + pid + ", pname=" + pname + "]";
	}	

}