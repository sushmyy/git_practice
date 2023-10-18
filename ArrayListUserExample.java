package source;
import java.util.*;
class Student
{
	int rno,age;
	String sname,address,dept;
	double total_marks;
	Student(int rno,int age,
	String sname,String address,String dept,
	double total_marks)
	{
		this.rno=rno;
		this.address=address;
		this.age=age;
		this.dept=dept;
		this.sname=sname;
		this.total_marks=total_marks;
	}
}
public class ArrayListUserExample {

	public static void main(String[] args) {
		List <Student> a1=new ArrayList<Student>();
		Student s1=new Student(101,23,"AAA","Kar","CS",98.4);
		Student s2=new Student(102,23,"MMM","Chn","IT",93.5);
		Student s3=new Student(103,23,"XXX","Del","CS",94.8);
		Student s4=new Student(104,23,"RRR","Kar","Civil",82.5);
		a1.add(s1);
		a1.add(s4);
		a1.add(s2);
		a1.add(s3);
		for(Student s:a1)
		{
			System.out.println(s.sname+" "+s.address+" "+s.age+" "+s.dept+" "+s.rno+" "+s.total_marks);

	}
	}
}
