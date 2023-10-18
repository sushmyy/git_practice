package source;
import java.util.*;
class ChecknumberException extends Exception
{
	ChecknumberException(String a)
	{
		super(a);
	}
}


public class CustomExceptionExample {

	static void check(int number)throws ChecknumberException{
		if (number%2!=0)
			 throw new ChecknumberException("Odd number");  
	     else  
	      System.out.println("even number");  
	   }  
		
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		   System.out.println("Enter your number ");
		   int a=s.nextInt();
		   try
		      {  
		      check(a);  
		      }
		      catch(Exception m)
		      {
		    	  System.out.println("Exception occured: "+m);
		    	  }  
		  
		      System.out.println("Thank you for using this application.....");  

	}

}
