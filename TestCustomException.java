package source;
import java.util.*;
class InvalidAgeException extends Exception
{  
 InvalidAgeException(String s)
 {  
  super(s);  
 }  
}  

public class TestCustomException 
	{  
		  
		   static void validate(int age)throws InvalidAgeException{  
		     if(age<18)  
		      throw new InvalidAgeException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
		   }  

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		   System.out.println("Enter your age ");
		   int a=s.nextInt();
	      try
	      {  
	      validate(a);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+m);
	    	  }  
	  
	      System.out.println("Thank you for using this application.....");  

	}

}
