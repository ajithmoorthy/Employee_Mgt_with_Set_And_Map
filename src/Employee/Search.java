package Employee;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
//this class implement the concept of polymorphism
public class Search {
	Scanner sc=new Scanner(System.in);
	/*Search Employee function is search the employee details based on the name and  get the user_input .
	 * if its matches print the matched employee details with same name
	*/
	public void Search(Map<Integer, String[]> employe) 
	{
		Set<Entry<Integer, String[]>> Database=employe.entrySet();
		int count=0;
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
			System.out.println("Enter the Employee Name to find the Employee");
			String EmployeeName=sc.next();
			for(Entry<Integer, String[]> x:Database)
			{
				Map.Entry<Integer,String[]> TempEmp=(Entry<Integer, String[]>) x;
				 
				try {
					String[] TempEmp1=TempEmp.getValue();
					///check the employee id equals to user input id 
				if(TempEmp1[0].equals(EmployeeName))
				{
					count++;
					for(int initial=0; initial<TempEmp1.length; initial++)
					{
						if(initial==0)
						{
							System.out.println("Personal Details");
							System.out.println("EmployeeName:\t"+TempEmp1[initial]);
						}
						if(initial==1)
						{
							System.out.println("Age:\t\t"+TempEmp1[initial]);
						}
						if(initial==2)
						{
							System.out.println("Email:\t\t"+TempEmp1[initial]);
						}
						if(initial==3)
						{
							System.out.println("Address:\t"+TempEmp1[initial]);
						}
						if(initial==4)
						{
							System.out.println("Gender:\t\t"+TempEmp1[initial]);
						}
						if(initial==5)
						{
							System.out.println("Professional Details");
							System.out.println("Designation:\t"+TempEmp1[initial]);
							System.out.println("EmployeeId:\t"+TempEmp.getKey());
						}
						if(initial==6)
						{
							System.out.println("Skills:\t\t"+TempEmp1[initial]);
						}
						if(initial==7)
						{
							System.out.println("Project:\t"+TempEmp1[initial]);
						}
						if(initial==8)
						{
							System.out.println("salary:\t\t"+TempEmp1[initial]);
						}
					}
					System.out.println("===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===");
					}
			}
			catch(NullPointerException e)
			{
				System.out.println("Employee is not available");
			}
			}
		if(count==0) {
			System.out.println("Wrong input for Name or Employee not available");
		}
		
	}
		  }
	/*Search Employee function is search the employee details based on the Designation and  get the user_input .
	 * if its matches print the matched employee details with same Designation
	*/

	public void Search(Map<Integer, String[]> employe,String Designation) 
	{
		Set<Entry<Integer, String[]>> Database=employe.entrySet();
		int count=0;
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
			for(Entry<Integer, String[]> x:Database)
			{
				Map.Entry<Integer,String[]> TempEmp=(Entry<Integer, String[]>) x;
				///check the employee id equals to user input id  
				try {
					String[] TempEmp1=TempEmp.getValue();
				if(TempEmp1[5].equals(Designation))
				{
					count++;
					for(int initial=0; initial<TempEmp1.length; initial++)
					{
						if(initial==0)
						{
							System.out.println("Personal Details");
							System.out.println("EmployeeName:\t"+TempEmp1[initial]);
						}
						if(initial==1)
						{
							System.out.println("Age:\t\t"+TempEmp1[initial]);
						}
						if(initial==2)
						{
							System.out.println("Email:\t\t"+TempEmp1[initial]);
						}
						if(initial==3)
						{
							System.out.println("Address:\t"+TempEmp1[initial]);
						}
						if(initial==4)
						{
							System.out.println("Gender:\t\t"+TempEmp1[initial]);
						}
						if(initial==5)
						{
							System.out.println("Professional Details");
							System.out.println("EmployeeId:\t"+TempEmp.getKey());
							System.out.println("Designation:\t"+TempEmp1[initial]);
						}
						if(initial==6)
						{
							System.out.println("Skills:\t\t"+TempEmp1[initial]);
						}
						if(initial==7)
						{
							System.out.println("Project:\t"+TempEmp1[initial]);
						}
						if(initial==8)
						{
							System.out.println("salary:\t\t"+TempEmp1[initial]);
						}
					}
					System.out.println("===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===*===");
					}
			}
				catch(NullPointerException e) {
					System.out.println("Employee is not available");
				}
				
			}
		if(count==0) {
			System.out.println("Wrong input for Designation or Employee not available");
		}
	}
		  }


}
