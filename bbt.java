import java.util.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class bbt extends JPanel{ 
 
	static int a = 0;
	static int b = 0;
	static Random r = new Random();
	static int x = r.nextInt(550);	// up to 550 width.
	static int y = r.nextInt(350);	// up to 350 height.
	static int z = r.nextInt();
	
	public void paint(Graphics g){ 

		// X, Y, WIDTH, HEIGHT
		for(int i = 0 ; i < 10 ; i++){
			
			x = r.nextInt(550);
			y = r.nextInt(350);
			
			g.fillOval(x, y, 50, 50);
		}
	} 

	public static void main(String[] args){ 

		JFrame frame = new JFrame("Bouncing Ball Test");	 
		frame.getContentPane().add(new bbt()); //Why the new segment same as the file name?
		frame.setSize(600, 400); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setResizable(false);		 

	} 
} 

					//Once start the program, the random value does not change,
					//so needed loop to change random value. So, whole Oval(x, y)
					//are in different.