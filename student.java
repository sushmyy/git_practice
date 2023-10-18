package source;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float m1,m2,m3,m4,m5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 5 subjects marks");
         m1=sc.nextFloat();
         m2=sc.nextFloat();
         m3=sc.nextFloat();
         m4=sc.nextFloat();
         m5=sc.nextFloat();
        float sum=m1+m2+m3+m4+m5;
        float avg=sum/5;
        System.out.println("Sum of 5 marks:"+sum);
        System.out.println("Average of marks:"+avg);
        if(avg>90)
        {
        	System.out.println("Grade is:A");
        }
        else if(avg<=90 && avg>=80)
        {
        	System.out.println("Grade is:B");
        }
        else if(avg<=80 && avg>=70)
        {
        	System.out.println("Grade is:C");
        	 }
        else if(avg<=70 && avg>=50)
        {
        	System.out.println("Grade is:D");
        }
        else if(avg<=50 && avg>=35)
         {
        	System.out.println("Grade is:E");
        }
        else
        {
        	System.out.println("Failed");
        }
        }
	}
	
	
	



