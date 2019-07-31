package Employee;

import java.util.InputMismatchException;

public class CustomException extends NumberFormatException {
	public CustomException() {
		// TODO Auto-generated constructor stub
		super("age is not negative");
	}


}
