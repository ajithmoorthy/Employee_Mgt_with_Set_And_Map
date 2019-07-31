package Employee;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
//delete the emplyee is done by the DeleteEmployee class and it has the Delete Employee fuction
public class DeleteEmployee {
	Scanner sc=new Scanner(System.in); 
	//Delete Employee function is delete the employee details based on the id this get the user_input if id from user and delete based on that
	public Map<Integer, String[]> DeleteEmployee(Map<Integer, String[]> employe) {
		// TODO Auto-generated constructor stub
		Set<Entry<Integer, String[]>> Database=employe.entrySet();
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
	System.out.println("Enter the Employee id to find the Employee");
	int Emp_id=sc.nextInt();
	int count=0;
	for(Entry<Integer, String[]> x:Database)
	{
		Map.Entry<Integer,String[]> TempEmp=(Entry<Integer, String[]>) x;
		///check the employee id equals to user input id  
		try {
		if(TempEmp.getKey().equals(Emp_id))
		{
			count++;
			System.out.println("Successfully Deleted Employee_id:"+TempEmp.getKey());
			employe.remove(TempEmp.getKey());
		}
		}
		catch(NullPointerException e) {
			System.out.println("Employee is not available");
		}
	}
	if(count==0)
	{
		System.out.println("Employee is Id not available");
	}
	}
		return employe;
}
}
