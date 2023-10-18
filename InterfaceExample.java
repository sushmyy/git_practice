package source;
interface Test_inter
{
	void show();
	void display();
}

class Orange implements Test_inter
{
	public void show()
	{
		System.out.println("Hello");
	}
	public void display()
	{
		
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Orange ob=new Orange();
		ob.show();

	}

}
