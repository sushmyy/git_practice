//function with arguments and no returntype. Addition of three numbers
package source;

public class Functionaar 
	{
	    static void add(int x,int y,int z) //definition //x,y,z formal arguments
	    { 
	    	
	    	int s=x+y+z;
	    	System.out.println("The sum of three number is :"+s);
	    }
		public static void main(String[] args) {
			//a,b,c are the actual arguments
			
			System.out.println("Hello...Starting of the program");
			int a=10, b=20, c=30;
			
			add(a,b,c);//function call
			System.out.println("Thank you...End of the program");
		}

	}



