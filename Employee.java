package source;
import java.util.Scanner;
public class Employee 
{
	String ename,eid,desig;  //attributes or datamembers
	float sal;
	
	void accept_details() //method
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name, id , designation and salary");
		ename=sc.nextLine();
		eid=sc.nextLine();
		desig=sc.nextLine();
		sal=sc.nextFloat();
	}
	
	void display_details()//method
	{
		System.out.println("EmployeeName\t\t EmployeeId\t\t EmployeeDesignation\t\tEmployeeSalary");
		System.out.println(ename+"\t\t\t"+eid+"\t\t\t"+desig+"\t\t\t"+sal);
	}

	public static void main(String[] args) 
	{
		Employee obj=new Employee();
		obj.accept_details();
		obj.display_details();

	}

}

	


