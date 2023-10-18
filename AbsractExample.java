package source;
abstract class Subject
{
	Subject()
	{
		System.out.println("Welcome to Base class");
	}
	void study() //non abstract method
	{
		System.out.println("Learning...");
	}
	abstract void syllabus_Learn(); //abstract method
	
	static void display() //static method
	{
		System.out.println("Hello...");
	}
	
}

class IT extends Subject
{
	void syllabus_Learn() //overriding
	{
		System.out.println("C , C++, Java, Python");
	}
}
public class AbsractExample {

	public static void main(String[] args) {
		IT ob=new IT();
		ob.syllabus_Learn();
		ob.study();
		//Subject s=new Subject();

	}

}
