package source;

public class CopyConstructor {
	
		float a,b;
		CopyConstructor(float x,float y)
		{
			a=x;
			b=y;
		}
		CopyConstructor(CopyConstructor ob)
		{
			System.out.println("Copy constructor is invoked");
			a=ob.a;
			b=ob.b;
		}
		void display()
		{
			System.out.println("The attribute value of a is "+a+" and b is "+b);
		}
		public static void main(String[] args) 
		{
			CopyConstructor obj1=new CopyConstructor(50.5f,60.5f);
			CopyConstructor obj2=new CopyConstructor(obj1);
			obj1.display();
			obj2.display();
		}
	}
	