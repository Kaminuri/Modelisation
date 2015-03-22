package panels;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import publics.Const;
import publics.Coordonnees;
import views.Displayz;

public class OptionPanel extends JPanel{
	private JButton nZoom , mZoom , pZoom, rotation, translationH, translationB, translationG, translationD ;
	public OptionPanel(){
		//super();
		this.setLayout(new GridLayout(1,8));
		nZoom = new JButton();
		mZoom = new JButton();
		pZoom = new JButton();
		rotation = new JButton();
		translationH = new JButton();
		translationB = new JButton();
		translationG = new JButton();
		translationD = new JButton();
		initPZoom();
		initTranslationH();


		add(pZoom);
		add(nZoom);
		add(mZoom);
		add(rotation);
		add(translationH);
		add(translationB);
		add(translationG);
		add(translationD);

	}

	private void initNZoom(){
		//	nZoom.setIcon(new ImageIcon(""));
		nZoom.setText("-");
		nZoom.setSize(new Dimension(10,70));


	}
	private void initPZoom(){
		pZoom.setText("+");
		//	pZoom.setIcon(new ImageIcon("/resources/Zoom+.jpg"));
		pZoom.setSize(new Dimension(10,70));
		pZoom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Quand on clic sur le bouton -> zoom avant
				
			}
		}); 


	}
	
	private void initTranslationH(){
		translationH.setText("↑");
		translationH.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Coordonnees.decreaseTransX();
				
			}
		});
		translationH.setSize(new Dimension(10,70));
	}
	private void initTranslationB(){
		translationB.setText("↓");
		
		translationB.setSize(new Dimension(10,70));
	}
	private void initTranslationG(){
		translationG.setText("←");

		translationG.setSize(new Dimension(10,70));
	}
	private void initTranslationD(){
		translationD.setText("→");
		
		translationD.setSize(new Dimension(10,70));
	}

	private void initMZoom(){
		nZoom.setIcon(new ImageIcon(""));
	}
	private void initRotation(){
		nZoom.setIcon(new ImageIcon(""));
	}
	
	

}
