package source;
import java.util.Scanner;
public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>=b)
		{
			if(a>=c)
			{
				if(b>=c)
			{
				System.out.println("Greatest number:"+a);
			}
			else
			{
				System.out.println("Greatest number:"+c);
			}
			}
			else
			{
				System.out.println("Greatest number:"+b);
			}
		}
			else
			{
				System.out.println("Greatest number:"+c);
			}
		}
		}
	
