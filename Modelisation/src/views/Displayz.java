package views;

import java.awt.Graphics;
import java.util.Collection;
import java.util.Collections;

import javax.swing.JPanel;

import entity.Point;
import loader.FileLoader;
import panels.OptionPanel;
import publics.Const;
import publics.Coordonnees;


public class Displayz extends JPanel {


	
	private static final long serialVersionUID = 1L;

	public Displayz(){
		FileLoader f = new FileLoader();
		Collections.sort(Const.points,new Point());
	}
	public void paintComponent(Graphics g){
		int [] listeX = new int [Const.points.size()];
		int [] listeY = new int[Const.points.size()];
		double x0 = Const.screenSize.getWidth() / 2;
		double y0 = Const.screenSize.getHeight() / 2;
		for(int i = 0; i < Const.points.size(); i++){
			listeX[i] = (int)(Const.points.get(i).getX()*Coordonnees.getZoomX() + x0);
			listeY[i] = (int)(Const.points.get(i).getY()*Coordonnees.getZoomY() + y0);
		}
		g.drawPolygon(listeX, listeY, Const.points.size());

	}    
	
	public void clearRepaint(){
		this.repaint();
	}
	
}