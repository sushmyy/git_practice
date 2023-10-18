package source;
import java.util.*;
public class Switchlargest {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number");
		a=sc.nextInt();
		b=sc.nextInt();
		int z=(a>b)?1:0;
		switch(z)
		{
		case 1:
			System.out.println("Largest number is:"+a);break;
		case 0:
			System.out.println("Largest number is:"+b);break;
		default:System.out.println("Invalid number");
		}
	}
}



