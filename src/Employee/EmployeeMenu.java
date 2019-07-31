package Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/***Employee menu class is creating a menu driven program  for the Employee management and perform the 
 * createEmployee
 * fetchEmployee
 *  deleteEmployee
 *  SearchEmployee*/
public class EmployeeMenu {
	//declare the Map for store the Employee Details
	Map<Integer, String[]> EmployeeDb=new HashMap<Integer,String[]>(100);
	//menu function is display the menu driven Employee menu
	 public void Menu() throws CustomException 
	{
	int options;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("\t\t\t\t*=*=*=*=*=*MENU*=*=*=*=*");
		System.out.println(" 1)Create Employee\n 2)Fetch Employee\n 3)Delete\n 4)Search\n 5)Logout");
		System.out.println("Choose the options");
		options=sc.nextInt();
		//switch case for the choose the operation
		switch(options)
		{
			case 1:
				//creating the object for the create employee class and it call the Personal_professDetails method
				CreateEmployee createEmp=new CreateEmployee();
				EmployeeDb.putAll(createEmp.PersonalDetails());
				break;
			case 2:
				// Ferforming the upcasting and fetch the employee details by id
				CreateEmployee fetch=new FetchEmployee(EmployeeDb);
				break;
			case 3:
				//deletethe employee based on the id
				DeleteEmployee delete=new DeleteEmployee();
				delete.DeleteEmployee(EmployeeDb);
				break;
			case 4:
				//search the employee based on the name and designation 
				Search search=new Search();
				System.out.println("Search Name or Designation");
				System.out.println(" 1) Name\n 2) Designation\n choose Options");
				int Searchvariable=sc.nextInt();
				switch(Searchvariable)
				{
				case 1:
					//search by the name to calling the Search method
					search.Search(EmployeeDb);
					break;
				case 2:
					//search by the Designation  to calling the Search method
					System.out.println("Enter the Designation to find the Employee's");
					String Designation=sc.next();
					search.Search(EmployeeDb,Designation);
					break;
				}
				break;
			case 5:
				//get out of the loop
				System.out.println("Logout successfully");
				Login log=new Login();
				log.login();
		}
	}while(true);
	}
	 
}
