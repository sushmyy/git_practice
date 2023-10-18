package source;

import java.util.*;  

class Material
{
   String productName;
   double productPrice;
   Material(String productName,double productPrice)
   {
	   this.productName=productName;
	   this.productPrice=productPrice;
	   
   }
}
class Customer1
{
	String customerName;
	int customerId;
	Customer1(String customerName,int customerId)
	{
		this.customerName=customerName;
		this.customerId=customerId;
	}
}

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet <Material> obj1=new TreeSet<Material>();
		Material p1=new Material("vivo v20",50000);
		Material p2=new Material("one plus",60000);
        obj1.add(p1);
        obj1.add(p2);
        for(Material p:obj1)
        {
        	System.out.println(" ProductName  : " + p.productName + " " + "  ProductPrice  : " + p.productPrice);
        }
        TreeSet <Customer1> obj2=new TreeSet<Customer1>();
        Customer1 c1=new Customer1("Sushmitha",504598);
        Customer1 c2=new Customer1("Ananthi",504599);
        obj2.add(c1);
        obj2.add(c2);
        for(Customer1 c:obj2)
        	
        {
        	System.out.println(" CustomerName : " + c.customerName + " " + " CustomerId    : " + c.customerId);
        }

	}

}
