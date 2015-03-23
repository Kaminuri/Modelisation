package frame.tools;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import panels.OptionPanel;
import views.Displayz;

public class InternalFrameOption extends JInternalFrame{
	
	public InternalFrameOption(Displayz d){
		super("",false,true,false, true);
		OptionPanel op = new OptionPanel(d);
		setContentPane(op);
		setSize(240,70);
		setLocation(50, 50);
	   	setVisible(true);
	}
}
