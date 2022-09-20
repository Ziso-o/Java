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

public class dialogautoclose{
	
	static JButton b = new JButton("Button");
	static JFrame f = new JFrame("Dialog Auto Close Test");
	
	public static void action(){
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				JOptionPane pane = new JOptionPane("Test Message", JOptionPane.INFORMATION_MESSAGE);
				
				JDialog dialog = pane.createDialog(null, "Title");
				dialog.setModal(false);
				dialog.setVisible(true);
				
				new Timer(3000, new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						dialog.setVisible(false);
					}
				}).start();
			}
		});
		
		f.setVisible(true);
	}
		

	public static void frame(){
		
		JPanel p = new JPanel();
		
		f.add(p);
		p.add(b);
		
		b.setSize(120,120);
	
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(640,480);
		f.getContentPane().add(b);
	}
		
	public static void main ( String [] args ){
		
		frame();
		action();
	}
}


////////////////////////////////////////

		/*
		Timer t = new Timer(1,new ActionListener(){
		
			public void actionPerformed(ActionEvent e){
				
				String message = "Dialog.";
				JLabel l = new JLabel(message);
				l.setHorizontalAlignment(JLabel.CENTER);
				
				b.addActionListener(new ActionListener(){						//START LOOP.
					public void actionPerformed(ActionEvent e){
						
						dialog.setVisible(true);								//POP-UP Visibility.
						
						try{
							
							Thread.sleep(3000);	// 1/1000 sec. == 3secs.
							dialog.setVisible(false);
							pane.setVisible(false);
							dialog.dispose(); //does not work, only pane option disappeared.
							System.out.println("TEST LOG...........");
													//'dialog.setVisible(false)' doesn't work so far, but 'Test Log' works.
						}
						catch(InterruptedException a){
		
						}
					}
				});
			}
		});
		t.start();
		//b.addActionListener(al);
	}	*/
	

////////////////////////////////////////

				/*
				try{
					
					Thread.sleep(3000);
				}
				
				catch(InterruptedException a){
					
					dialog.setVisible(false);
				}
				
				
				
				new Timer(3000, new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					  dialog.setVisible(false);
					}
				}).start();
				*/