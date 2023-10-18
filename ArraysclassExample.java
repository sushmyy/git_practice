package source;
import java.util.Arrays;
public class ArraysclassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a[]= {3.4,6.7,8.9,3.1};
		System.out.println("Before the sorting the array values are ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.binarySearch(a, 6.7));
		Arrays.sort(a);
		System.out.println("After the sorting the array values are ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.binarySearch(a, 6.7));
	}

}