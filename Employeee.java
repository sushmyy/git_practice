package source;
import java.util.Scanner;
public class Employeee 
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
		
		System.out.println(ename+"\t\t\t"+eid+"\t\t\t"+desig+"\t\t\t"+sal);
	}

	public static void main(String[] args) 
	{
		Employee obj=new Employee();
		obj.accept_details();
		Employee obj1=new Employee();
		obj1.accept_details();
		System.out.println("EmployeeName\t\t EmployeeId\t\t EmployeeDesignation\t\tEmployeeSalary");
		obj.display_details();
		obj1.display_details();
		

	}

}

	