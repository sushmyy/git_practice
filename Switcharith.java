package source;
import java.util.*;
public class Switcharith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sh=new Scanner(System.in);
		System.out.println("Enter the value for choice");
		System.out.println("1.addition\n2.subraction\n3.multiplication\n4.division\n5.exit");
		int c=sh.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Enter two values for addition:");
			 a=sh.nextInt();
			 b=sh.nextInt();
			System.out.println("The addition of two value is:"+(a+b));break;
		case 2:
			System.out.println("Enter two values for subraction:");
			 a=sh.nextInt();
			 b=sh.nextInt();
			System.out.println("The difference of two value is:"+(a-b));break;
		case 3:
			System.out.println("Enter two values for Multiplication:");
			 a=sh.nextInt();
			 b=sh.nextInt();
			System.out.println("The product of two value is:"+(a*b));break;
		case 4:
			System.out.println("Enter two values for division:");
			 a=sh.nextInt();
			 b=sh.nextInt();
			System.out.println("The Qoutient of two value is:"+(a/b));break;
		case 5:
			System.exit(0);break;
			default:System.out.println("Invalid choice");
		}

	}

}
