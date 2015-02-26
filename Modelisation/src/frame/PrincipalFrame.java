package frame;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

import views.Displayz;
import frame.tools.MBar;


public class PrincipalFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 210494281408622074L;
	private MBar menuBar;
	public PrincipalFrame(){
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    screenSize.width -= 42;
	    screenSize.height -= 42;
	    setPreferredSize(screenSize);
	    setLocation(20, 20);
	    
	    JDesktopPane dtp = new JDesktopPane();
	    dtp.add(new JLabel("Coucou test"));
	    //dtp.setBackground(Color.GREEN);
	    setContentPane(dtp);
	    
		menuBar = new MBar();
		setJMenuBar(menuBar);

		
		
		
		//this.setResizable(true);
		this.pack();
	    //this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	        public void run() {
	          new PrincipalFrame();
	        }
	    });
	}

}
