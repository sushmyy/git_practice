package source;
/*
class Vehicle
{
	void start()
	{
		System.out.println("It starting....");
	}
	void stop()
	{
		System.out.println("It is stopped");
	}
	void move()
	{
		System.out.println("It si moving....");
	}
}

class Car extends Vehicle
{
	 void extra()
	 {
		 System.out.println("It is a four wheeler ");
	 }
}

public class SingleInheritance {

	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.start();
		obj.move();
		obj.extra();
		obj.stop();

	}

}
*/
//multilevel
class Vehicle
{
	void start()
	{
		System.out.println("It starting....");
	}
	void stop()
	{
		System.out.println("It is stopped");
	}
	void move()
	{
		System.out.println("It si moving....");
	}
}

class Car extends Vehicle
{
	 void extra()
	 {
		 System.out.println("It is a four wheeler ");
	 }
}

class BMW extends Car
{
	void feature()
	{
		System.out.println("It is one of the luxurous car");
	}
}


public class SingleInheritance 
{

	public static void main(String[] args)
	{
		BMW obj=new BMW();
		obj.start();
		obj.move();
		obj.feature();
		obj.extra();
		obj.stop();

	}

}