import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jpaneltest{
	public static void main(String[] args){
		
		JFrame f = new JFrame("JPanel Test");
		JPanel p = new JPanel();
		
		JButton b = new JButton("JButton");
		JLabel l = new JLabel("JLabel");
		JTextField t = new JTextField(480);
		
		p.add(b);
		p.add(t);
		p.add(l);
		
		t.setPreferredSize(new Dimension(240,50));
		
		f.getContentPane().add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(640,480);
		f.setVisible(true);
	}
}