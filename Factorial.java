package source;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		// Write a program to find factorial of given number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();//5
		int f=1;
		for(int i=1;i<=n;i++)//1<=5 2<=5 3<=5 4<=5 5<=5
		{
			f=f*i;//1*1=>1*2=>2*3=>6*4=>24*5=>120
		}
		System.out.println("The factorial number of "+n+" is "+f);
			

	}

}
