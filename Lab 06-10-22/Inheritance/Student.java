public class Student extends Person {
	
	int marks;
	
	Student(int pid, String pname, int marks) {
		super(pid, pname);
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", pid=" + pid + ", pname=" + pname + "]";
	}
	
}