package source;
import java.util.ArrayList;
class Item
{
   String productName;
   double productPrice;
   Item(String productName,double productPrice)
   {
	   this.productName=productName;
	   this.productPrice=productPrice;
	   
   }
}
class Customer
{
	String customerName;
	int customerId;
	Customer(String customerName,int customerId)
	{
		this.customerName=customerName;
		this.customerId=customerId;
	}
}



public class ArrayListUserExample2 {

	public static void main(String[] args) {
		ArrayList <Item> obj1=new ArrayList<Item>();
		Item p1=new Item("vivo v20",50000);
		Item p2=new Item("one plus",60000);
        obj1.add(p1);
        obj1.add(p2);
        for(Item p:obj1)
        {
        	System.out.println(" ProductName  : " + p.productName + " " + "  ProductPrice  : " + p.productPrice);
        }
        ArrayList <Customer> obj2=new ArrayList<Customer>();
        Customer c1=new Customer("Sushmitha",504598);
        Customer c2=new Customer("Sangeetha",504599);
        obj2.add(c1);
        obj2.add(c2);
        for(Customer c:obj2)
        	
        {
        	System.out.println(" CustomerName : " + c.customerName + " " + " CustomerId    : " + c.customerId);
        }
	}

}
