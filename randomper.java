import java.util.*;

public class randomper {
	
	public static void main (String [] args){
		
		Random a = new Random();
		Double b = a.nextDouble();
		double c = Double.parseDouble(String.format("%.2f", 10.0/b));
		
		// [%.2f] stands for how many of decimal point, in this case, 'xx.xx'.
		
		while ( c <= 50 ){
			
			double d = a.nextDouble();

			c = a.nextDouble();
			c = Double.parseDouble(String.format("%.2f", 10.0/d));
			// System.out.println(c + "%");
			
			if ( c >= 100 ){
				
				c = 100;
		
			}
			else if ( c <= 0 ){
				
				c = 0;
			}
			
			System.out.println(c + "%");
		}		
	}
}