package panels;

import java.awt.Dimension;
import java.awt.Graphics;
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
import views.Displayz;

public class OptionPanel extends JPanel{
	private JButton nZoom, pZoom, rotationX, rotationY, rotationZ, translationH, translationB, translationG, translationD ;
	private Displayz d;
	public OptionPanel(Displayz d){
		this.d = d;
		this.setLayout(new GridLayout(1,8));
		nZoom = new JButton(new ImageIcon("src/resources/pictures/ZoomM.png"));
		pZoom = new JButton(new ImageIcon("src/resources/pictures/ZoomP.png"));
		rotationX = new JButton();
		rotationY = new JButton();
		rotationZ = new JButton();
		translationH = new JButton(new ImageIcon("src/resources/pictures/transH.png"));
		translationB = new JButton(new ImageIcon("src/resources/pictures/transB.png"));
		translationG = new JButton(new ImageIcon("src/resources/pictures/transG.png"));
		translationD = new JButton(new ImageIcon("src/resources/pictures/transD.png"));
		initNZoom();
		initPZoom();
		rotationX();
		rotationY();
		rotationZ();
		initTranslationH();
		initTranslationB();
		initTranslationD();
		initTranslationG();

		add(pZoom);
		add(nZoom);
		add(rotationX);
		add(rotationY);
		add(rotationZ);
		add(translationH);
		add(translationB);
		add(translationG);
		add(translationD);

	}

	private void initNZoom(){
		nZoom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				d.decreaseZoomY();
				d.decreaseZoomX();
				d.repaint();				
			}
		});
		nZoom.setSize(new Dimension(70,70));


	}
	private void initPZoom(){
		pZoom.setSize(new Dimension(70,70));
		pZoom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//Quand on clic sur le bouton -> zoom avant

				d.increaseZoomX();
				d.increaseZoomY();
				d.repaint();
			}
		}); 


	}
	
	private void initTranslationH(){
		translationH.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				d.decreaseTransY();
				d.repaint();
			}
		});
		translationH.setSize(new Dimension(70,70));
	}
	private void initTranslationB(){
		translationB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				d.increaseTransY();
				d.repaint();
			}
		});
		translationB.setSize(new Dimension(70,70));
		d.repaint();
	}
	private void initTranslationG(){
		translationG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				d.decreaseTransX();
				d.repaint();
			}
		});
		translationG.setSize(new Dimension(70,70));
		d.repaint();
	}
	private void initTranslationD(){
		translationD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				d.increaseTransX();
				d.repaint();
			}
		});
		translationD.setSize(new Dimension(70,70));
	}

	private void rotationX(){
		rotationX.setText("rotX");
		rotationX.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				d.rotationX(0.1);
				d.repaint();
			}
		});
	}
	private void rotationY(){
		rotationY.setText("RotY");
		rotationY.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d.rotationY(0.1);
				d.repaint();
				
			}
		});
	}
	private void rotationZ(){
		rotationZ.setText("RotZ");
		rotationZ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				d.rotationZ(0.1);
				d.repaint();
			}
		});
	}
	
	

}
