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


// Intense of IOException, use try & catch loop. It is necessary.
// Time is based on the local time, laptop set time. If, set time has been changed, local time value also will be changed.

public class timer extends JPanel{
	
		static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		static Scanner sc = new Scanner(System.in);
		static String s = new String(LocalTime.now().format(dtf2));
	
		static JLabel jl = new JLabel("");	// 'jl' top margin 20 (after click the button, has an empty space below.
		
		static JOptionPane pane = new JOptionPane("First Shutdown Alert.\n This Message will be disappeared in 10 seconds.", JOptionPane.INFORMATION_MESSAGE);
		static JDialog dialog = pane.createDialog(null, "First Alert");
		static JOptionPane pane2 = new JOptionPane("The laptop is shutting down in 10 seconds.", JOptionPane.INFORMATION_MESSAGE);
		static JDialog dialog2 = pane2.createDialog(null, "Shut Down");
		// pane & dialog set as static, for the error, more than accepted times of running.
		
		static JLabel jl2 = new JLabel("Shutdown Time : ");
		static JTextField jtf = new JTextField("Please enter shutdown time : 'Hour:Minute:Second' .", 30);
		static JButton jb = new JButton("OK");

	public static void renewt(){	// Using time code set as '18:00:00' not '06:00:00' hard to define am or pm.


		ActionListener al = new ActionListener(){
			
			public void actionPerformed(ActionEvent e2){
				
				s = jtf.getText();	//Must enter 'xx:xx:xx' include whole TimeFormat.
				String timeLabel22 = s;
				
				// Once to compare time, save the value of 's' as date format.
				
				jb.setVisible(false);
				jtf.setVisible(false);
				
				LocalTime shutdowntime = LocalTime.parse(timeLabel22, dtf2);
				LocalTime timeLabel1 = shutdowntime.minus(Duration.ofSeconds(600));
				LocalTime timeLabel11 = timeLabel1.plus(Duration.ofSeconds(10));
				LocalTime timeLabel2 = shutdowntime.minus(Duration.ofSeconds(10));
				
				System.out.println("\n1st Alert on at : " + timeLabel1);
				System.out.println("\n1st Alert off at : " + timeLabel11);
				System.out.println("\n2nd ALert on at : " + timeLabel2);
				System.out.println("\nShutdown time at : " + s);
				
				//timeLabel == real time
				//timeLabel1 == 1st alert on.
				//timeLabel11 == 1st alert off.
				//timeLabel2 == 2nd alert on.
				//timeLabel22 == 2nd alert off & shutdown.
				
					Timer t = new Timer(1000,new ActionListener(){		// x == speed ( smaller = faster )
									//1000 == 1sec.
							
							public void actionPerformed(ActionEvent e){		// timeLabel11 = s - 10m / timeLabel2 = s - 9m 50s / timeLabel22 = s - 10s.
								
								DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); // Hours, Minutes, Seconds.
								String realtime= new String(LocalTime.now().format(dtf)); // Real-time. (based on the computer set time).
								jl.setText(realtime);
								LocalTime timeLabel = LocalTime.parse(realtime, dtf);
								
								dialog.setModal(false);
								dialog2.setModal(false);
								
								int compare = timeLabel.compareTo(shutdowntime);
								
								
								if(timeLabel.equals(timeLabel1)){	//1st alert on.
									
									dialog.setVisible(true);
									System.out.println("\nFirst Alert, the laptop is shutting down in 10 minutes.");
									
								}
							
								else if(timeLabel.equals(timeLabel11)){ //1st alert off.
									
									dialog.setVisible(false);
								}

								else if(timeLabel.equals(timeLabel2)){	//2nd alert on.
						
									dialog2.setVisible(true);
									System.out.println("\nThe laptop is shutting down soon.");
								}
																		//2nd alert off & shutdown.
								else if(compare > 0 ){ 	// While the value of 'compare' is 1, true, running this statement.
								
										dialog2.setVisible(false);
								
									try{
										
										Runtime runtime = Runtime.getRuntime();
										Process proc = runtime.exec("shutdown -s"); // Having a delay about 10 - 20 seconds.
										System.exit(0);								// The final window system alert.	
									}
									catch(IOException a){
									}
								}
								
							}
					});
					t.start();
			}
		};
		jb.addActionListener(al);
	}
	
	public static void frame (){
		
		JFrame f = new JFrame("Frame Timer Test");
		JPanel p = new JPanel();
		
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,170);
		// After click the button, change size of Y axis to '150'.
		f.setVisible(true);
		f.setAlwaysOnTop(true);

		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setFont(new Font("Courier", Font.BOLD,75));		// Timer font set.
		jl.setForeground(Color.WHITE);
		
		jtf.setHorizontalAlignment(JTextField.CENTER);
		

		//p.add(jl2);
		p.add(jtf);
		p.add(jb);
		p.add(jl);
		p.setBackground(Color.BLACK);
		
	}
	
	public static void main(String [] args){
		frame();
		renewt();
	}
}