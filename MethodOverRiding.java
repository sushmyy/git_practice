package source;
class Animal
{
void sound()
{
System.out.println("Makes sound");
}
}

class Lion extends Animal
{
void sound()
{
System.out.println("It Roars");
}
}

class Dog extends Animal
{
void sound()
{
	System.out.println("It Barks");
}
}



public class MethodOverRiding {

	public static void main(String[] args) {
		Animal obj1=new Lion(); //runtime polymorphism
		Animal obj2=new Dog();
		obj1.sound();
		obj2.sound();


	}

}
