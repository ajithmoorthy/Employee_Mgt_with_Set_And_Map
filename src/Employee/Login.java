package Employee;

import java.util.Scanner;
/*create the class for Login to Enter the Username and password to login the login page
 * this class implement the encapsulation by using the getter methods */
public class Login {
	private static String Name="Ajith",Password="230117";
	//Getter methods for the setting username and password
	private String GetUsername()
	{
		return Name;
	}
	private String GetPassword()
	{
		return Password;
	}
	//login method for login the login page and call the Employee menu 
	public void login()
	{
		String User_input_name="",User_input_pass="";
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n\t\t\t\t=*=*=*LOGIN*=*=*=");
		System.out.printf("Enter the Username:");
		User_input_name=sc.next();
		System.out.printf("Enter the Password:");
		User_input_pass=sc.next();
		if(GetUsername().equals(User_input_name) && GetPassword().equals(User_input_pass))
		{
			System.out.println("Succesfully Logged in");
			EmployeeMenu emp=new EmployeeMenu();
			emp.Menu();
			
		}
		else
		{
			System.out.println("Username or password is Incorrect type valid username or password");
			login();
		}
	}
	
}
