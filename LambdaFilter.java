package source;
import java.util.stream.Collectors;
import java.util.*;
//program to implement a lambda expression to filter out even and odd numbers from a list of integers.
public class LambdaFilter {

	public static void main(String[] args) {
		List<Integer>number=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
		List<Integer>even=number.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer>odd=number.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println("Even number : " + even);
		System.out.println("odd number  : " + odd);

	}

}
