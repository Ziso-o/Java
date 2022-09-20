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

public class timertest extends JPanel{
		
		static JButton jb = new JButton("Start");
		static JButton jb2 = new JButton("Stop");
		static JLabel jl = new JLabel("");

	public static void renewt(){
		
		jb.addActionListener(new ActionListener(){
		

				public void actionPerformed(ActionEvent e){
					
					jb.setVisible(false);
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); // Hours, Minutes, Seconds.
					String timeLabel = new String(LocalTime.now().format(dtf));
					jl.setText(timeLabel);
					

					String timeLabel1 = timeLabel.format("17:00:00");	//1st alarm.
					String timeLabel11 = timeLabel.format("17:00:10");	
					
					String timeLabel2 = timeLabel.format("17:10:00");	//2nd alarm & shut down.
					String timeLabel22 = timeLabel.format("17:10:10");
					
					int compare = timeLabel.compareTo(timeLabel2); //is timeLabel bigger than timeLabel2? yes. TRUE(1).
					
					if(timeLabel.equals(timeLabel1)){	// 17:00:00
						
						
						JOptionPane pane = new JOptionPane("The laptop is going to be shutting down in 10 MINUTES.", JOptionPane.INFORMATION_MESSAGE);
						JDialog dialog = pane.createDialog(null, "ALERT");
						dialog.setVisible(true);
						
						try{
							
								//Thread.sleep(5000); //5sec
							pane.setVisible(false);
							dialog.setVisible(false);
							dialog.dispose(); //does not work, only pane option disappeared.
							System.out.println("Somehow, many weeks of one week has passed so far... \n pretty much tired of being going company. I want this finish as soon as possible hopefully.");
							renewt();
							Thread.sleep(5000);
						}
						
						catch(InterruptedException a){
						}
						
					}
					else if(timeLabel.equals(timeLabel2)){	// 17:10:00
						
						JOptionPane pane = new JOptionPane("The laptop is going to be shutting down in 10 SECONDS.", JOptionPane.INFORMATION_MESSAGE);
						JDialog dialog = pane.createDialog(null, "ALERT");
						dialog.setVisible(true);
						System.out.println("The laptop is going to shutting down in 10 SECONDS.");
						
						renewt();
						
						try{
							
							Runtime runtime = Runtime.getRuntime();
							Process proc = runtime.exec("shutdown -s -t 10");
							System.exit(0);
							
						}
						catch(IOException a){
						}
						
					}
					
					else if(compare > 0 ){ //while the value of 'compare' is 1, true, running this statement.
							
						try{
							
							Runtime runtime = Runtime.getRuntime();
							Process proc = runtime.exec("shutdown -s");
							System.exit(0);
							
						}
						catch(IOException a){
						}
					}
				}
		});
	}
	
	public static void frame (){
		
		JFrame f = new JFrame("Frame Timer Test");
		JPanel p = new JPanel();
		
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,150);
		f.setVisible(true);
		//f.setAlwaysOnTop(true);
		
		//f.getContentPane().setBackground(Color.BLACK);
		//f.pack();
		
		//jb.setToolTipText("This button will be disappeared");
		
		jl.setHorizontalAlignment(JLabel.CENTER);
		jl.setFont(new Font("Courier", Font.BOLD,75));
		jl.setForeground(Color.WHITE);
		
		//
		
		p.add(jl);
		p.add(jb);
		p.setBackground(Color.BLACK);

		//jt.setPreferredSize(new Dimension(320,60));
		//jt.setHorizontalAlignment(JTextField.CENTER);
		//jt.setFont(new Font("Courier", Font.BOLD,50));
	}
	
	public static void main(String [] args){
		frame();
		renewt();
	}
}