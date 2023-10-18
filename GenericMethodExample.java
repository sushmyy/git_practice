package source;

public class GenericMethodExample {
	public static <E> void printArray(E [] values)  //generic method
	{
		for(E x:values)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
        Integer [] intarray= {50,60,80,70,40,30};
		
		Character [] chararray= {'H','E','L','L','O'};
		
		String [] strarray= {"Generic","Program","Method"};
		
		System.out.println("Intgere Array Values");
		printArray(intarray);
		
		System.out.println("String Array Values");
		printArray(strarray);
		
		System.out.println("Character Array Values");
		printArray(chararray);

	}

}
