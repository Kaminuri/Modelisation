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
	private JButton nZoom , mZoom , pZoom, rotationX, rotationY, translationH, translationB, translationG, translationD ;
	private Displayz d;
	public OptionPanel(Displayz d){
		this.d = d;
		this.setLayout(new GridLayout(1,8));
		nZoom = new JButton();
		mZoom = new JButton();
		pZoom = new JButton();
		rotationX = new JButton();
		rotationY = new JButton();
		translationH = new JButton();
		translationB = new JButton();
		translationG = new JButton();
		translationD = new JButton();
		initNZoom();
		rotationX();
		initPZoom();
		rotationY();
	//	initRotationD();
		initTranslationH();
		initTranslationB();
		initTranslationD();
		initTranslationG();

		add(pZoom);
		add(nZoom);
		add(mZoom);
		add(rotationX);
		add(rotationY);
		add(translationH);
		add(translationB);
		add(translationG);
		add(translationD);

	}

	private void initNZoom(){
		//	nZoom.setIcon(new ImageIcon(""));
		nZoom.setText("-");
		nZoom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				d.decreaseZoomY();
				d.decreaseZoomX();
				d.repaint();				
			}
		});
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

				d.increaseZoomX();
				d.increaseZoomY();
				d.repaint();
			}
		}); 


	}
	
	private void initTranslationH(){
		translationH.setText("↑");
		translationH.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				d.decreaseTransY();
				d.repaint();
			}
		});
		translationH.setSize(new Dimension(10,70));
	}
	private void initTranslationB(){
		translationB.setText("↓");
		translationB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				d.increaseTransY();
				d.repaint();
			}
		});
		translationB.setSize(new Dimension(10,70));
		d.repaint();
	}
	private void initTranslationG(){
		translationG.setText("←");
		translationG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				d.decreaseTransX();
				d.repaint();
			}
		});
		translationG.setSize(new Dimension(10,70));
		d.repaint();
	}
	private void initTranslationD(){
		translationD.setText("→");
		translationD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				d.increaseTransX();
				d.repaint();
			}
		});
		translationD.setSize(new Dimension(10,70));
	}

	private void rotationX(){
		rotationX.setText("rot");
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
	
	
	

}
