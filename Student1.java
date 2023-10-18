package source;
import java.util.Scanner;
public class Student1 
{
	String name,Id;
	int m1,m2,m3;
	
	
		void accept_details()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Studentname,Student Id, Student mark");
			name=sc.nextLine();
			Id=sc.nextLine();
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
			
		}
		void display_details()
		{
			int avg=m1+m2+m3;
			int total=avg/3;
			System.out.println("StudentName\t\t StudentId\t\t Total marks of 3 subject");
			System.out.println(name+"\t\t\t"+Id+"\t\t\t"+total);
		}
		public static void main(String[] args)
		{
			Student1 obj=new Student1();
			obj.accept_details();
			obj.display_details();
	}

}
