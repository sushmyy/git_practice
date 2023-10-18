package source;

public class StringExample {

	public static void main(String[] args) 
	/*
	{
		String s1="java";
		String s2="Java";
		String s3=new String("java");
		System.out.println("The address of s1 is "+s1.hashCode());
		System.out.println("The address of s2 is "+s2.hashCode());
		System.out.println("The address of s3 is "+s3.hashCode());
	}

}
	*/
	{
	String s1="java";

	String s2="Java is an object oriented langauge";

	System.out.println("after concatenation the string is "+s1.concat(" strings"));

	System.out.println("The length of the string is "+s1.length());

	System.out.println(s2.charAt(12));

	System.out.println(s2.substring(8, 10));

	StringBuffer s3=new StringBuffer("Java is an object oriented langauge");

	System.out.println(s3.insert(10, "FFFFF"));

	System.out.println(s3. reverse());
	}
}
