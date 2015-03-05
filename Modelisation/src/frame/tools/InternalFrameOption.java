package frame.tools;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import panels.OptionPanel;

public class InternalFrameOption extends JInternalFrame{
	
	public InternalFrameOption(){
		super("",false,true,false, true);
		OptionPanel op = new OptionPanel();
		setContentPane(op);
		setSize(240,70);
		setLocation(50, 50);
	   	setVisible(true);
	}
}
