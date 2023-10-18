package source;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		//TreeSet <String> T1=new TreeSet<String>();
		HashSet <String> T1=new HashSet<String>();
		T1.add("Rahul");
		T1.add("Amrita");
		T1.add("Sumi");
		T1.add("Kavya");
		T1.add("Hima");
		T1.add("Amrita");
		T1.add("Amrita");
		System.out.println("Student names are :");
		for(String s:T1)
		{
			System.out.println(s);
		}

	}

}
