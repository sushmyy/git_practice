package source;
//Default constructor
public class DefaultConstructorEXample {
	int a;
	DefaultConstructorEXample()
	{
		int a=10;
		System.out.println("Hello.....Constructor Invoked");
	}
	void print_value()
	{
		System.out.println("The value of x:" + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructorEXample obj =new DefaultConstructorEXample();
		obj.print_value();
		DefaultConstructorEXample obj1 =new DefaultConstructorEXample();
		obj1.print_value();

	}

}
