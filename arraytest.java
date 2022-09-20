import java.util.*;

public class arraytest {
	public static void main (String [] args){
		int[] array;
		int i = 11;
		array = new int[i];
			
		for(int b = 0 ; b < 11 ; b++){
			System.out.print("The number of array is " + array[b] + b);
			System.out.println(" and the value is " + b*10 + ".");
		
		}
	}
}