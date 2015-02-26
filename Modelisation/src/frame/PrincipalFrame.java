package frame;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	    
	    Displayz dtp = new Displayz();
	    JInternalFrame mboxFrame = new JInternalFrame("Mail Reader", true,true, true, true);
        JLabel reader = new JLabel("Mail Reader Would Be Here");
        mboxFrame.setContentPane(reader);
        mboxFrame.setSize(400, 300);
        mboxFrame.setLocation(50, 50);
        mboxFrame.setVisible(true);
        dtp.add(mboxFrame);

	    JPanel ok = new JPanel();
	    //ok.add(new JLabel("Coucou test"));
	    ok.add(dtp);
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
