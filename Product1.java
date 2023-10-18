package source;
//Argument constructor

public class Product1 {
	String ProductName;
	int ProductId;
	int ProductPrice;
	Product1 (String Name,int Id,int Price)
	{
		ProductName=Name;
		ProductId=Id;
		ProductPrice=Price;
		
	}
	void display_details()
	{
		System.out.println("The Product Name is : " + ProductName);
		System.out.println("The Product Id is : " + ProductId);
		System.out.println("The Product Price is " + ProductPrice);
	}

	public static void main(String[] args) {
		Product1 obj=new Product1("dell",0021,50000);
	    obj.display_details();

	}

}
