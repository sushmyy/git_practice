package source;
import java.util.*;
//import java.util.Scanner;
public class userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		String s;
		s=(age>=18)?"You are eligible to vote":"you are not eligilble to vote";
		System.out.println("The result is:"+s);
		

}
};