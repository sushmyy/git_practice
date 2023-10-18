package source;
import java.util.*;
public class Switchexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Addition \n 2.Subraction \n 3.Multiplication \n 4.Division \n 5.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the two values for addition");
			a=sc.nextFloat();
			b=sc.nextFloat();
			System.out.println("The sum is:"+(a+b));break;
		case 2:
			System.out.println("Enter the two values for Subraction");
			a=sc.nextFloat();
			b=sc.nextFloat();
			System.out.println("The difference is:"+(a-b));break;
		case 3:
			System.out.println("Enter the two values for Multiplication");
			a=sc.nextFloat();
			b=sc.nextFloat();
			System.out.println("The product is:"+(a*b));break;
		case 4:
			System.out.println("Enter the two values for Division");
			a=sc.nextFloat();
			b=sc.nextFloat();
			System.out.println("The qoutient is:"+(a/b));break;
		case 5:
			System.exit(0);break;
			
			default:System.out.println("Invalid choice!!!");
		}
		

	}

}
