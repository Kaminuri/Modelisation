package panels;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionPanel extends JPanel{
	private JButton nZoom , mZoom , pZoom, rotation ,translation ;
	public OptionPanel(){
		//super();
		this.setLayout(new GridLayout(1,5));
		nZoom = new JButton( new ImageIcon(Toolkit.getDefaultToolkit().getImage("/src/pictures/Zoom +.jpg")));
		mZoom = new JButton();
		pZoom = new JButton();
		rotation = new JButton();
		translation = new JButton();
		initPZoom();

		add(nZoom);
		add(pZoom);
		add(mZoom);
		add(rotation);
		add(translation);
	}
	
	private void initNZoom(){
		nZoom.setIcon(new ImageIcon(""));
	}
	private void initPZoom(){
		 try {
			    Image img = ImageIO.read(getClass().getResource("/Modelisation/src/pictures/Zoom+.jpg"));
			    pZoom.setIcon(new ImageIcon(img));
			  } catch (IOException ex) {
				  System.out.println("Wow Dat error");
			  }
//		ImageIcon tmp = new ImageIcon(Toolkit.getDefaultToolkit().getImage());
//		pZoom.setIcon(tmp);
//		System.out.println("ok ?");
	}
	private void initMZoom(){
		nZoom.setIcon(new ImageIcon(""));
	}
	private void initRotation(){
		nZoom.setIcon(new ImageIcon(""));
	}
	private void initTranslation(){
		nZoom.setIcon(new ImageIcon(""));
	}
	
}
