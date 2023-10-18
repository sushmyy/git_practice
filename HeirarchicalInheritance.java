package source;
import java.util.Scanner;
class Rectangle
{
	int l,b;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		l=sc.nextInt();
		b=sc.nextInt();
	}
}

class Area extends Rectangle
{
	int Area_Value()
	{
		return l*b;
	}
}
class Perimeter extends Rectangle
{
	int Peri_value()
	{
		return 2*(l+b);
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		Area a=new Area();
		a.accept();
		System.out.println("The area of the rectangle is "+a.Area_Value());
		
		Perimeter p=new Perimeter();
		p.accept();
		System.out.println("The Perimeter of the rectangle is "+p.Peri_value());

	}

}
