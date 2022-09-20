import java.util.*;

public class randomtest {
	public static void main (String [] args){
		Random a = new Random();
		
		System.out.println(a.nextBoolean()); // true or false
		System.out.println(a.nextFloat());	// range : 0.0f ~ 1.0f (exclusive)
		System.out.println(a.nextInt());	// all possible int values
		System.out.println(a.nextInt(100)); // range : 0 ~ 99
		System.out.println(a.nextDouble());
	}
}