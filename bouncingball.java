import java.util.*;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class bouncingball extends JPanel{ 
 
	static int a = 0;
	static int b = 0;
	static Random r = new Random();
	static int x = r.nextInt(540);
	static int y = r.nextInt(300);
	static int z = r.nextInt((540*2 - 330*2));
	
	public void paint(Graphics g){	

		// X, Y, WIDTH, HEIGHT
		for(int i = 0 ; i < 9 ; i++){
				
			g.drawLine(x, y, z, z);
			//g.drawRect(x, y, 50, 50);
			g.fillOval(x, y, 50, 50);
			
			x = r.nextInt(540);
			y = r.nextInt(300);
			z = r.nextInt((540*2 - 330*2));

		}												// Make sure that for loop works, within lively moving animation.
	} 

	public static void main(String[] args){ 

		JFrame frame= new JFrame("Welcome to JavaTutorial.net");	 
		frame.getContentPane().add(new bouncingball()); 
		frame.setSize(600, 400); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setResizable(false);		 

	} 
} 
	// animate

