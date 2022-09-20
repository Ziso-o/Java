import java.io.*;
import java.sql.*;
import java.awt.*;
import java.time.*;
import java.text.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.TimerTask;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

import java.time.temporal.ChronoUnit;
		//key import.


public class calculation{
	
	public static void main (String [] args){
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); // Hours, Minutes, Seconds.
			String timeLabel = new String(LocalTime.now().format(dtf)); // Real-time. (based on the computer set time).
			
			String timeLabel1 = timeLabel.format("18:10:00");
			String timeLabel2 = timeLabel.format("18:00:00");
			
			LocalTime time1 = LocalTime.parse(timeLabel1, dtf);
			LocalTime time2 = LocalTime.parse(timeLabel2, dtf);
			Long minute = ChronoUnit.MINUTES.between(time1, time2);
			
			//LocalTime localTimeAfter5Minutes = LocalTime.now().plusMinutes(5);
			
			System.out.println("\n" + time1);
			System.out.println(time2);
			System.out.println("Difference between time in minutes : " + minute);
			// -10
			
			//Long minus = ChronoUnit.MINUTES.minus(time1, time2);
			
			System.out.println(time1.minus(Duration.ofMinutes(10)));			
		
	}
}