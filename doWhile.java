package source;
import java.util.Scanner;
public class doWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bal=500,amt1,amt2;
		String s;
		do
		{
			System.out.println("Enter your choice ");
			System.out.println("1. Withdraw\n 2.Deposit\n 3.Balance\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to withdraw");
				amt1=sc.nextInt();
				bal-=amt1;
				System.out.println("After withdraw the current balance is "+bal);break;
			case 2:
				System.out.println("Enter the amount to deposit");
				amt2=sc.nextInt();
				bal+=amt2;
				System.out.println("After deposit the current balance is "+bal);break;
			case 3:
				
				System.out.println("the current balance is "+bal);break;
			default:System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue , type YES or yes");
			s=sc.next();
		}while(s.equals("YES")||s.equals("yes"));
		
	}
}