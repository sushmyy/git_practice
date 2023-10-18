package source;

public class ConstructorOverLoad 
{
	int a,b,c;
	ConstructorOverLoad() //default constructor
	{
		a=10;
		b=20;
		c=30;
		System.out.println("The sum is "+(a+b+c));
	}
	ConstructorOverLoad(int x,int y) // parameterized constructor
	{
		a=x;
		b=y;
		System.out.println("The product is "+(a*b));
	}
	ConstructorOverLoad(int x) //one argument constructor
	{
		a=x;
		System.out.println("The cube of the number is "+(a*a*a));
	}
	public static void main(String[] args) 
	{
		ConstructorOverLoad obj1=new ConstructorOverLoad();
		ConstructorOverLoad obj2=new ConstructorOverLoad(2,2);
		ConstructorOverLoad obj3=new ConstructorOverLoad(3);

	}

}