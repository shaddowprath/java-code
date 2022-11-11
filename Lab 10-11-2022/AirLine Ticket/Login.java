import java.lang.*;
import java.util.Scanner;

class InvalidPasswordException extends Exception {
    int passwordConditionViolated = 0;

	public InvalidPasswordException(int passwordConditionViolated) {
		super("Invalid Password: ");
		this.passwordConditionViolated = passwordConditionViolated;
	}

	public String printMessage()
	{
        // Using switch statement to allocate the errors when User enters the password
		switch (passwordConditionViolated) {

		case 1:
			return ("Password length should be between 8 to 15 characters");

		case 2:
			return ("Password should not contain any space");

		case 3:
			return ("Password should contain at least one digit(0-9)");

		case 4:
			return ("Password should contain at least one special character");

		case 5:
			return ("Password should contain at  least one uppercase letter(A-Z)");

		case 6:
			return ("Password should contain at least one lowercase letter(a-z)");
		}

		return ("");
	}
}

public class Login  {

	public static void isValid(String password)throws InvalidPasswordException {

        // To check the length of the password
		if (!((password.length() >= 8) && (password.length() <= 15))) {
			throw new InvalidPasswordException(1);
		}

        // If the password has spaces in between
		if (password.contains(" ")) {
        throw new InvalidPasswordException(2);
		}
		if (true) {
			int count = 0;

            //If the user enters any integer value so this loop will change it into String 
            for (int i = 0; i <= 9; i++) {
				String str1 = Integer.toString(i);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(3);
			}
		}

        // This will check all the problems relative to the password if any error comes Switch case 4 will handle it
        if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-") || password.contains("+") || password.contains("/") 		|| password.contains(":") || password.contains(".") || password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?") || password.contains("|"))) {
			throw new InvalidPasswordException(4);
		}

		if (true) {
			int count = 0;

			// To check capital letters
			for (int i = 65; i <= 90; i++) {
				char c = (char)i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(5);
			}
		}

		if (true) {
			int count = 0;
			// To check for  small letters
			for (int i = 90; i <= 122; i++) {
				char c = (char)i;
				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new InvalidPasswordException(6);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your preferred Username");
		String s1 = sc.nextLine();
		System.out.println("Enter your password");
		String password1 = sc.nextLine();
		try {
			System.out.println("Is Password " + password1 + " valid?");
			isValid(password1);
			System.out.println("Username: " + s1);
			System.out.println("This is a Valid Password");
		}
		catch (InvalidPasswordException e) {
			System.out.print(e.getMessage());
			System.out.println(e.printMessage());
		}
		sc.close();
	}
}