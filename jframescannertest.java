import java.io.*;
import java.sql.*;
import java.awt.*;
import java.time.*;
import java.text.*;
import java.awt.event.*;
import java.util.TimerTask;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.*;


// Intense of IOException, use try & catch loop. It is necessary.
// Time is based on the local time, laptop set time. If, set time has been changed, local time value also will be changed.

public class jframescannertest extends JPanel{
	
		static JLabel jl = new JLabel("");
		
		static JOptionPane pane = new JOptionPane("First Shutdown Alert. \n This Message will be disappeared in 10 seconds.", JOptionPane.INFORMATION_MESSAGE);
		static JDialog dialog = pane.createDialog(null, "First Alert");
		static JOptionPane pane2 = new JOptionPane("The laptop is shutting down in 10 seconds.", JOptionPane.INFORMATION_MESSAGE);
		static JDialog dialog2 = pane2.createDialog(null, "Shut Down");
		// pane & dialog set as static, for the error, more than accepted times of running.
		

	public static void renewt(){
		
		Timer t = new Timer(0,new ActionListener(){		// x == speed ( smaller = faster )
				
				public void actionPerformed(ActionEvent e){
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); // Hours, Minutes, Seconds.
					String timeLabel = new String(LocalTime.now().format(dtf)); // Real-time. (based on the computer set time).
					jl.setText(timeLabel);
					
					DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:" + 10);
					String now = new String(LocalTime.now().format(dtf2));
					System.out.println(now);
					
					String timeLabel1 = timeLabel.format("17:35:00");	// 1st alarm on.
					String timeLabel11 = timeLabel.format("17:35:10");	//			off.
					
					String timeLabel2 = timeLabel.format("17:40:00");	// 2nd alarm on & shut down.
					String timeLabel22 = timeLabel.format("17:40:10");	//			off.
					
					int compare = timeLabel.compareTo(timeLabel22);		// is 'timeLabel' bigger than 'timeLabel22'? yes. [TRUE(1)]
					
					dialog.setModal(false);		// key method about visibility for dialogs.
					dialog2.setModal(false);	// *
					
					if(timeLabel.equals(timeLabel1)){		// 17:35:00
															// Printing script only for once .
						dialog.setVisible(true);
						System.out.println("First Alert, The laptop is shutting down in 10 minutes.");
					}
					
					else if(timeLabel.equals(timeLabel11)){	// 17:35:10
						
						dialog.setVisible(false);
					}
					
					else if(timeLabel.equals(timeLabel2)){	// 17:40:00
						
						dialog2.setVisible(true);
					}
					else if(compare > 0 ){ 	// While the value of 'compare' is 1, true, running this statement.
											// Bigger than '17:40:10'. ( timeLabel2 )
							dialog2.setVisible(false);
							System.out.println("\nThe laptop is shutting down soon.");
							
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
		System.out.println("\nFirst Alert at, '17:35:00'.");
		System.out.println("Second Alert at, '17:40:00'.");
	}
	
	public static void frame (){
		
		JFrame f = new JFrame("Frame Timer Test");
		JPanel p = new JPanel();
		
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,150);
		f.setVisible(true);
		f.setAlwaysOnTop(true);

		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setFont(new Font("Courier", Font.BOLD,75));		// Timer font set.
		jl.setForeground(Color.WHITE);

		p.add(jl);
		p.setBackground(Color.BLACK);
		
	}
	
	public static void main(String [] args){
		frame();
		renewt();
	}
}