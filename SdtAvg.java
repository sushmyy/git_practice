package source;
import java.util.*;
public class SdtAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 subject marks");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		int a4=sc.nextInt();
		int a5=sc.nextInt();
		int sum=a1+a2+a3+a4+a5;
		float avg=sum/5;
		System.out.println("sum:"+sum);
		System.out.println("Average:"+avg);
		if(avg>90)
		{
			System.out.println("A Grade");
		}
		else if(avg<=90 && avg>=80)
		{
			System.out.println("B Grade");
		}
		else if(avg<=80 && avg>=70)
		{
			System.out.println("C Grade");
		}
		else if(avg<=70 && avg>=60)
		{
			System.out.println("D Grade");
		}
		else if(avg<=60 && avg>=50)
		{
			System.out.println("E Grade");
		}
		else 
			System.out.println("Failed");
	}

}




