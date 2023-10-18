package source;
import java.util.*;
class Book
{
	String BookName;
	int BookId;
	String AuthorName;
	String Publisher;
	int Quantity;
	


Book(String BookName,int BookId,String AuthorName,String Publisher,int Quantity)
{
	this.BookName=BookName;
	this.BookId=BookId;
	this.AuthorName=AuthorName;
	this.Publisher=Publisher;
	this.Quantity=Quantity;
	
}
}

public class hashMapExample {

	public static void main(String[] args) {
		HashMap <Integer,Book> obj1=new HashMap<Integer,Book>();
		Book b1=new Book("BookName1",1110,"AuthorName1","Publisher1",6);
		Book b2=new Book("BookName2",1120,"AuthorName2","Publisher2",7);
		Book b3=new Book("BookName3",1130,"AuthorName3","Publisher3",8);
		Book b4=new Book("BookName4",1140,"AuthorName4","Publisher4",9);
		obj1.put(1,b1);
        obj1.put(2,b2);
        obj1.put(3,b3);
        obj1.put(4,b4);
        for(Map.Entry<Integer,Book> m:obj1.entrySet()){    
 	    Book b= m.getValue();
        System.out.println(b.BookName + "   " + b.BookId + "   " + b.AuthorName + "   " + b.Publisher + "   "  + b. Quantity);
	}
	}
}
