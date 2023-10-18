//function with no arguments and returntype. Addition of three numbers
package source;

public class Functionnawr {
	 static int add() //definition 
	    { 
		 int a=10, b=20, c=30;
	    	int s=a+b+c;
	    	return s;
	    	
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello...Starting of the program");
		
		int res=add();//function call
		System.out.println("The sum of three number is :"+res);
		System.out.println("Thank you...End of the program");

	}

}
