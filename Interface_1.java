package source;
interface Searchable{
	boolean search(String keyword);
}
 class Document implements Searchable{
	 String message;
	 public Document(String message){
		 this.message=message;
	 }
	public boolean search(String keyword) {
		if(message.contains(keyword))
		{
			return true;
		}
		return false;
 
	}
	
}
public class Interface_1 {

	public static void main(String[] args) {
        Document a=new Document("Hello everyone");
		
		System.out.println(a.search("Hello"));

	}

}
