package source;
import java.util.*;
public class Atmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=100000;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your choice");
      System.out.println("1.balance check\n2.withdrawal\n3.deposit\n4.Exit");
      int c=sc.nextInt();
      switch(c)
      {
      case 1:
    	  System.out.println("Your available balance is:$"+t);break;
      case 2:
    	  System.out.println("Enter your amount to withdrawal:$");
    	  int w=sc.nextInt();
    	  System.out.println("Your available balance is:$"+(t-w));break;
      case 3:
    	  System.out.println("Enter your amount to deposit:$");
    	  int d=sc.nextInt();
    	  System.out.println("Your available balance is:$"+(t+d));break;
      case 4:
    	  System.exit(0);break;
    	  default:System.out.println("Invalid choice");
	}
	}
}
