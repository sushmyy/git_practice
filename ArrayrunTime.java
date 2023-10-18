package source;
import java.util.Scanner;
public class ArrayrunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array ");
		n=sc.nextInt();
		int [] x=new int[n];
		System.out.println("Enter the array elements ");
		for(int i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("The user entered array valyues are ");
		for(int i=0;i<n;i++) //traversing
		{
			System.out.println(x[i]);
		}
		}

}
