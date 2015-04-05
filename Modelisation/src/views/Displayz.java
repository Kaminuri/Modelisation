package views;

import java.awt.Color;
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
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, HEIGHT, WIDTH);
		g.setColor(Color.BLACK);
		int [] listeX = new int[Const.points.size()];
		int [] listeY = new int[Const.points.size()];
		int [] listeZ = new int[Const.points.size()];
		double x0 = Const.screenSize.getWidth() / 2;
		double y0 = Const.screenSize.getHeight() / 2;
		double z0 = (x0/2)+y0/2;
		for(int i = 0; i < Const.points.size(); i++){
			listeX[i] = (int)(Const.points.get(i).getX()*Coordonnees.getZoomX() + x0 + Coordonnees.getTransX());
			listeY[i] = (int)(Const.points.get(i).getY()*Coordonnees.getZoomY() + y0 + Coordonnees.getTransY());
			listeZ[i] = (int)(Const.points.get(i).getZ()*Coordonnees.getZoomY() + z0 + Coordonnees.getTransZ());
		}
		g.drawPolygon(listeX, listeY, Const.points.size());
		g.drawPolygon(listeY, listeZ, Const.points.size());

	}    
	
	
	
}