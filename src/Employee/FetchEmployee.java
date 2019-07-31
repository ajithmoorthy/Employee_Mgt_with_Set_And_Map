package Employee;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/** fetch employee class is have the Fetch Employee constructor 
 * And this fetchEmployee class is inherited by the createEmployee class*/
public class FetchEmployee extends CreateEmployee  {
	// this constructor is implementing the fetching the details of employee based on the employee id 
	public FetchEmployee(Map<Integer, String[]> employe) 
	{
		 Set<Entry<Integer, String[]>> Database=employe.entrySet();
		int count=0;
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
		System.out.println("Enter the Employee id to find the Employee");
		int Emp_id=sc.nextInt();
		for(Entry<Integer, String[]> x:Database)
		{
			Map.Entry<Integer,String[]> TempEmp=(Entry<Integer, String[]>) x;
			///check the employee id equals to user input id  
			try {
			if(TempEmp.getKey().equals(Emp_id))
			{
				count++;
				String[] TempEmp1=TempEmp.getValue();
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
							System.out.println("Employee Id:\t"+TempEmp.getKey());
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
				catch(NullPointerException e){
					System.out.println("Employee is not available");
				}
			}
		if(count==0) {
			System.out.println("Wrong input for id or Employee is not available");
		}

	}
  }
		
}
