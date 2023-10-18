package source;
import java.util.*;
public class MethodOverloadedExample {


		void sum()
		{
			int a=10,b=20;
			int c=a+b;
			System.out.println("The sum is "+c);
		}
		void sum(float a,int b)
		{
			System.out.println("The sum of one int and one float value is "+(a+b));
		}
		void sum(double x,double y,double z)
		{
			System.out.println("The sum of three double values is "+(x+y+z));
		}
		public static void main(String[] args)
		{
			MethodOverloadedExample ob=new MethodOverloadedExample();
			ob.sum();
			ob.sum(23.5f, 56);
			ob.sum(5.3, 6.5, 9.5);
			
			

		}

	}