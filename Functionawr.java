//function with arguments and returntype. Addition of three numbers
package source;

public class Functionawr {
	
	static int add(int x, int y,int z) //definition 
    { 
	 int s=x+y+z;
     return s;
    }
	public static void main(String[] args) {
		System.out.println("Hello...Starting of the program");
		int a=10, b=20, c=30;
		int res=add(a,b,c);//function call
		System.out.println("The sum of three number is :"+res);
		System.out.println("Thank you...End of the program");

	}

}
