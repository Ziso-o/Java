import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// ww w.  j a  v a  2s  .co  m
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class att {
	
	static JButton button = new JButton ("Button");
	static JFrame frame1 = new JFrame();
	
  public static void move(){

	Timer t = new Timer(1, new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			
			JOptionPane pane = new JOptionPane("Test Text", JOptionPane.INFORMATION_MESSAGE);
			
			JDialog dialog = pane.createDialog(null, "Title");
			dialog.setModal(false);
			dialog.setVisible(true);
			
			try{
				
				Thread.sleep(3000);
				dialog.setVisible(false);
				System.out.println("Test Log...");
			}
			catch(InterruptedException a){
				
			}
			
			dialog.setVisible(true);
			
		}
	});
	t.start();
  }
  
	public static void frame(){
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(100, 100);
		frame1.getContentPane().add(button);
	}

	public static void main(String [] args){
		
		frame();
		move();
	}
}