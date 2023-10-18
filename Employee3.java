package source;
import java.util.*;
public class Employee3 {

	
		String ename,eid,desig;  //attributes or datamembers
		float sal;
		Employee3(String n,String i,String d,float s)
		{
			ename=n;
			eid=i;
			desig=d;
			sal=s;
		}
		
		void display_details()//method
		{
			
			System.out.println(ename+"\t\t\t"+eid+"\t\t\t"+desig+"\t\t\t"+sal);
		}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int num;
			System.out.println("Enter the number of employees");
			num=sc.nextInt();
			Employee3 [] obj=new Employee3[num]; //array of employee type
			System.out.println("Enter the employee name, id , designation and salary");
			String n=sc.nextLine();
			String id=sc.nextLine();
			String d=sc.nextLine();
			float sa=sc.nextFloat();
			for(int i=0;i<num;i++)
			{
				obj[i]=new Employee3(n,id,d,sa); //object reference of employee
				
			}
			System.out.println("EmployeeName\t\t EmployeeId\t\t EmployeeDesignation\t\tEmployeeSalary");
			for(int i=0;i<num;i++)
			{
				obj[i].display_details();
			}
			
		}

	}
