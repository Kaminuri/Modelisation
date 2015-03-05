package panels;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
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
		nZoom = new JButton();
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
		    Image img = ImageIO.read(getClass().getResource("src/pictures/Zoom+.jpg"));
		    pZoom.setIcon(new ImageIcon(img));
		  } catch (IOException ex) {
		  }
		//pZoom.setIcon(new ImageIcon("src/pictures/Zoom+.jpg"));
		pZoom.setSize(new Dimension(10,70));
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
