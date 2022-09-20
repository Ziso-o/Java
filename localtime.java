import java.util.*;
import java.sql.*;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.*;
import java.text.SimpleDateFormat;

public class localtime {
	
	public static void renewt(){
		
		TimerTask tt = new TimerTask(){
			
			public void run(){
				
				DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("HH:mm:ss");
				String timeLabel = new String(LocalTime.now().format(dtf));
				System.out.println(timeLabel);
								
				/*if(dtf == DateTimeFormatter.ofPattern("09:13:00")){
					System.out.println("asd");
				} not working */
			}				
		};
		Timer t = new Timer();
		long delay = 0;
		long intevalPeriod = 1 * 1000; // second interval
		t.scheduleAtFixedRate(tt, delay, intevalPeriod);
	}
	
	public static void main(String [] args){		
		
		renewt();
	}
}

