package source;

public class Shape {
	void Perimeter()
	{
	int a=10;
	int b=25;
	int c=2*(a+b);
	System.out.println("Perimeter of the rectangle :" + c);
	}
	void Perimeter(double x,int y,int z)
	{
		System.out.println("Perimeter of the triangle :" + (x+y+z)); 
	}
	void Perimeter(int a)
	{
		System.out.println("Perimeter of the Square :" + (4*a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Shape ob =new Shape();
		 ob.Perimeter();
		 ob.Perimeter(3.5,5,10);
		 ob.Perimeter(10);
	}

}
