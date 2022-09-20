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

public class buttontest extends JPanel{
		
		static JButton jb = new JButton("Start");
		static JButton jb2 = new JButton("Stop");
		static JLabel jl = new JLabel("");
		
		static JOptionPane pane = new JOptionPane("First Shutdown Alert. \n This Message will be disappeared in 10 seconds.", JOptionPane.INFORMATION_MESSAGE);
		static JDialog dialog = pane.createDialog(null, "First Alert");
		static JOptionPane pane2 = new JOptionPane("The labtop is shutting down in 10 seconds.", JOptionPane.INFORMATION_MESSAGE);
		static JDialog dialog2 = pane2.createDialog(null, "Shut Down");

	public static void renewt(){
		
		Timer t = new Timer(0,new ActionListener(){
				
				public void actionPerformed(ActionEvent e){
						
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss"); // Hours, Minutes, Seconds.
					String timeLabel = new String(LocalTime.now().format(dtf));
					jl.setText(timeLabel);
					
					String timeLabel1 = timeLabel.format("15:20:00");	//1st alarm.
					String timeLabel11 = timeLabel.format("15:20:10");	
					
					String timeLabel2 = timeLabel.format("15:21:00");	//2nd alarm & shut down.
					String timeLabel22 = timeLabel.format("15:21:10");
					
					int compare = timeLabel.compareTo(timeLabel22); //is timeLabel bigger than timeLabel2? yes. TRUE(1).
					
					dialog.setModal(false);
					dialog2.setModal(false);
					
					if(timeLabel.equals(timeLabel1)){
						
						dialog.setVisible(true);
						System.out.println("First Alert, The labtop is shutting down in 10 minutes.");
					}
					
					else if(timeLabel.equals(timeLabel11)){
						
						dialog.setVisible(false);
					}
					
					else if(timeLabel.equals(timeLabel2)){
						
						dialog2.setVisible(true);
					}
					else if(compare > 0 ){ //while the value of 'compare' is 1, true, running this statement.
							
							dialog2.setVisible(false);
							System.out.println("The labtop is shuttong down in 10 seconds.");
					}
				}
		});		
		t.start();
		jb.setVisible(false);
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
		//p.add(jb);
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