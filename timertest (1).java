import java.util.*;

public class timertest{
	public static void main (String [] args){
		
		TimerTask tt = new TimerTask(){
		int i = 0;
		int m = 60;
		int n = 1;
		int nn = 0;
			
			@Override
			public void run(){
				
				System.out.println("Now " + nn + " minutes " + i + " seconds passing.");
				i++;
				
				if( i == m ){
					System.out.println(n + " minutes passed.");
					n++;
					nn++;
					i = 0;
				}
			}			
		};	
		
		Timer t = new Timer();
		long delay = 0;
		long intevalPeriod = 1 * 1000; // second interval
		t.scheduleAtFixedRate(tt, delay, intevalPeriod);
	}	
}