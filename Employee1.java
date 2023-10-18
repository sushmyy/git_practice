package source;

import java.util.Scanner;

public class Employee1 {

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
			Scanner sc=new Scanner(System.in);
			int num;
			System.out.println("Enter the number of employees");
			num=sc.nextInt();
			Employee1 [] obj=new Employee1[num]; //array of employee type
			for(int i=0;i<num;i++)
			{
				obj[i]=new Employee1(); //object reference of employee
				obj[i].accept_details();
			}
			System.out.println("EmployeeName\t\t EmployeeId\t\t EmployeeDesignation\t\tEmployeeSalary");
			for(int i=0;i<num;i++)
			{
				obj[i].display_details();
			}
			
		}
	}

