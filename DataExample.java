package source;
import java.util.Date;
public class DataExample {

	public static void main(String[] args) {
		Date D=new Date();
		System.out.println(D);
		System.out.println(D.getTime());// time would change in mili second format
		/* why we need this kind of representation(mili seconds): you know the current time with mill second.
		 * because it would change every second
		 * Jan 1 1970 expires 2038
		 * It is not safe for web project.
		 */
	}

}
