import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class eventt{
	public static void main(String[] args){
		
		JFrame f = new JFrame("Event Test");
		JPanel p = new JPanel();
		
		JButton b = new JButton("JButton");
		JLabel l = new JLabel("JLabel");
		JTextField t = new JTextField();
		
		p.add(t);
		p.add(l);
		p.add(b);
		
		t.setPreferredSize(new Dimension(240,25));
		t.setText("Please click the button.");
		b.setToolTipText("This button is for testing.");
		
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(640,480);
		f.setVisible(true);
		
		//
		ActionListener al = new ActionListener(){
			
			@Override
			
			public void actionPerformed(ActionEvent e){
				System.out.println("Working.");
				t.setText("Working.");
				
			}
		};
		//
		b.addActionListener(al);
	}
}