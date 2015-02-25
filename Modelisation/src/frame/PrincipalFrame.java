package frame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

import frame.tools.MBar;


public class PrincipalFrame extends JFrame{
	private MBar menuBar;
	public PrincipalFrame(){
		menuBar = new MBar();
		setJMenuBar(menuBar);
		//this.getContentPane().add();
		this.setResizable(true);
		this.pack();
		
	    this.setLocationRelativeTo(null);
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
