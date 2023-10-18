package source;

import java.util.Scanner;

public class Product{
	String Name;
	int  Id;
	int Price;//attributes
	
	void accept_Productdetails() //method
	{ 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Product Name, Id, Price");
	     Name=sc.nextLine();
		 Id=sc.nextInt();
	     Price=sc.nextInt();
	 }
	void display_Productdetails()//method
	{
		System.out.println(Name+"\t\t\t"+Id +"\t\t\t"+Price);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of Product");
		n=sc.nextInt();
		Product [] obj=new Product[n];
		for(int i=0;i<n;i++)
		{
			obj[i]=new Product(); 
			obj[i].accept_Productdetails();
		}	
			System.out.println("Product Name\t\tProduct Id\t\tProduct Price");
			
			for( int i=0;i<n;i++)
			{
				
				obj[i].display_Productdetails();
			}
	}
	}