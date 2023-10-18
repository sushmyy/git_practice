//function with no arguments and no returntype. Addition of three numbers
package source;

public class Function 
{
    static void add() //definition
    { 
    	int a=10, b=20, c=30;
    	int s=a+b+c;
    	System.out.println("The sum of three number is :"+s);
    }
	public static void main(String[] args) {
		
		
		System.out.println("Hello...Starting of the program");
		add();//function call
		System.out.println("Thank you...End of the program");
	}

}
