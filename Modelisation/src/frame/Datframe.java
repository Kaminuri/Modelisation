package frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import panels.Panes;

public class Datframe extends JFrame{
	
	public Datframe(){
		Panes pan = new Panes();
		this.getContentPane().add(pan );
		this.setResizable(true);
		this.pack();
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);

	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          new Datframe();
	        }
	    });
	}

}
