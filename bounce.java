import java.io.*;
import java.sql.*;
import java.awt.*;
import java.time.*;
import java.text.*;
import java.awt.event.*;
import java.util.Random;
import java.util.TimerTask;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.*;


// Make sure that all the import languages are not ambiguous.
// In this case, all util.* and swing.* were ambiguous.


// It moves properly but can't see in real-time but clicking title to change its size back and forth.


public class bounce extends JPanel{ 
 
	static int a = 0;
	static int b = 0;
	static Random r = new Random();
	static int x = r.nextInt(540);
	static int y = r.nextInt(300);
	static int z = r.nextInt();
	
	public void paint(Graphics g){	
				
				g.fillOval(x, y, 50, 50);
				
		Timer t = new Timer(1000, new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				// X = WIDTH, Y = HEIGHT
				
				g.fillOval(x, y, 50, 50);
				
				for(int i = 0 ; i < 1 ; i ++){
					
					g.fillOval(x, y, 50, 50);
					
					x = r.nextInt(540);
					y = r.nextInt(300);
					
					x++;
					y++;
					
					
					if( x > 540 ){
						x--;
					}
					else if ( y > 300 ){
						y--;
					}
					System.out.println("Test Log...................");
				}
			}
		});
		t.start();

	// Make it animated.
	} 

	public static void main(String[] args){ 

		JFrame frame= new JFrame("Welcome to JavaTutorial.net");	 
		frame.getContentPane().add(new bounce()); // Change file title correctly.
		frame.setSize(600, 400); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	} 
} 