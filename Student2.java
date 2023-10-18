package source;

public class Student2 {
        int rno,age;
		String sname;
		Student2(String n,int a,int r)
		{
			rno=r;
			age=a;
			sname=n;
		}
		void display()
		{
			System.out.println("The student name is "+sname);
			System.out.println("The student age is "+age);
			System.out.println("The student roll number is "+rno);
		}
		public static void main(String[] args) 
		{
			Student2 s1=new Student2("Kavya",23,300);
			s1.display();
			Student2 s2=new Student2("Sumi",23,301);
			s2.display();
		}
	
	}
