package frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Datframe extends JFrame{
	
	public Datframe(){
		JLabel image = new JLabel( new ImageIcon( "src/pictures/wow.png"));
		this.getContentPane().add(image );
		this.setResizable(false);
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
