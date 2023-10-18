package source;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=5000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.balance check \n 2.withdraw \n 3.deposit  \n 4.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		    case 1:
			System.out.println("your balance is: "+balance);
			break;
		    case 2:
			System.out.println("Enter the amount to withdraw:$");
			int withdrawal=sc.nextInt();
			System.out.println("balance is:"+(balance-withdrawal));
			break;
			case 3:	
	       System.out.println("Enter the amount to deposit:$");
			int deposit=sc.nextInt();
			System.out.println("balance is:"+(balance+deposit));
			break;
		    case 4:
			System.exit(0);break;
			
			default:System.out.println("Invalid choice!!!");
		}
	}

	}


	


