package mypack2;

public class StringManipulation {
	
	public static void main(String[] args) {
		String a = "Painting";
		String b = "Pratahmesh";
		String c = "Hello my name is Prathamesh";

		//'=' method
		System.out.println(a == b);

		//equals method
		System.out.println(a.equals(b));
		
		//concat method
		System.out.println(a.concat(b));
		
		//replace method
		System.out.println(c.repeat(2));
		
		//split method
		System.out.println(c.split("K"));
		
		//Char method
		System.out.println(a.charAt(4));
		
		//compareTo method
		System.out.println(b.compareTo(a));
		
		//substring method
		System.out.println(c.substring(2, 5));
		
	}

}