import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class dialogtest{
	
	static JButton b = new JButton("Button");
	static JTextField t = new JTextField();
	static JOptionPane pane = new JOptionpane("Test", JOptionPane.INFORMATION_MESSAGE);
	static JDialog dialog = pane.createDialog(null, "Title");
	
	public static void action(){
		
		ActionListener al = new ActionListener(){
		
			public void actionPerformed(ActionEvent e){
				
				t.setText("Pop-Up!");
				String message = "Dialog.";
				JLabel l = new JLabel(message);
				l.setHorizontalAlignment(JLabel.CENTER);
				//JOptionPane.showMessageDialog(null, l);
				pane;
			}
		};
		b.addActionListener(al);
	}
	
	public static void frame(){
		
		JFrame f = new JFrame("Dialog Test");
		JPanel p = new JPanel();
		
		p.add(b);
		p.add(t);
		
		t.setPreferredSize(new Dimension(100,50));
		
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(640,480);
		f.setVisible(true);
	}
	public static void main(String[] args){
		
		action();
		frame();
	}
}


