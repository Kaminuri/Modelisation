package views;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Collections;

import javax.swing.JPanel;

import entity.Item;
import entity.Point;
import publics.Const;


public class Displayz extends JPanel {

	private int zoom;
	private int zoomX = 100;
	private int zoomY = -100;
	private int zoomZ = 100;
	private int [] listeX,listeY,listeZ;
	private int transX,transY,transZ;
	private static final long serialVersionUID = 1L;

	public Displayz(Item i){
		zoomX = (int) (Const.screenSize.getWidth()/Math.abs(i.extremites()[2]-i.extremites()[3]));
		zoomY = (int) (Const.screenSize.getHeight()/Math.abs(i.extremites()[0]-i.extremites()[1]));
		zoom = zoomX > zoomY ? zoomY -70 : zoomX;
		zoomX = zoom;
		zoomY = -zoom;
		
		Collections.sort(Const.points,new Point());
	}
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, Const.screenSize.width,Const.screenSize.height);
		g.setColor(Color.BLACK);
		listeX = new int[Const.points.size()];
		listeY = new int[Const.points.size()];
		listeZ = new int[Const.points.size()];
		double x0 = Const.screenSize.getWidth() / 2;
		double y0 = Const.screenSize.getHeight() - 60;
		double z0 = (x0/2)+y0/2;
		for(int i = 0; i < Const.points.size(); i++){
			listeX[i] = (int)(Const.points.get(i).getX()*zoomX + x0 + transX);
			listeY[i] = (int)(Const.points.get(i).getY()*zoomY + y0 + transY);
		//	listeZ[i] = (int)(Const.points.get(i).getZ()*Coordonnees.getZoomZ() + z0 + Coordonnees.getTransZ());
		}
		g.drawPolygon(listeX, listeY, Const.points.size());
		
	}   
	
	
	public void rotationX(double angle){
		for(int i = 0;i<listeX.length;i++){
			System.out.println(i+ " : " + listeY[i]);
			listeY[i] = (int) (listeY[i]*Math.cos(angle)+listeZ[i]*Math.sin(angle));
			System.out.println(i+ " : " + listeY[i] + "\n\n");

			listeZ[i] = (int)(listeY[i]*-Math.sin(angle)+listeZ[i]*Math.cos(angle));
			
		}
	}
	
	public void rotationY(double angle){
		for(int i = 0;i<listeX.length;i++){
			listeX[i] = (int) (listeX[i]*Math.cos(angle)-listeZ[i]*Math.sin(angle));
			listeZ[i] = (int)(listeX[i]*Math.sin(angle)+listeZ[i]*Math.cos(angle));
			
		}
	}
	
	public void rotationZ(double angle){
		for(int i = 0;i<listeX.length;i++){
			listeX[i] = (int) (listeX[i]*Math.cos(angle)+listeY[i]*Math.sin(angle));
			listeY[i] = (int)(listeX[i]*-Math.sin(angle)+listeY[i]*Math.cos(angle));
			
		}
	}
	
	public   void increaseZoomX(){
		zoomX *= 1.1;
	}

	public   void decreaseZoomX(){
		zoomX *= 0.9;
	}

	public   void increaseZoomY(){
		zoomY *= 1.1;
	}

	public   void decreaseZoomY(){
		zoomY *= 0.9;
	}
	public   int getZoomX() {	
		return zoomX;
	}
	public   int getZoomY() {
		return zoomY;
	}
	
	public   int increaseTransX(){
		return transX = transX + 15;
	}
	public   int increaseTransY(){
		return transY = transY + 15;
	}
	public   int decreaseTransX(){
		return transX = transX - 15;
	}
	public  int decreaseTransY(){
		return transY = transY - 15;
	}
	public   int getTransX(){
		return transX;
	}

	public   int getTransY(){
		return transY;
	}
	public   int getTransZ() {
		return transZ;
	}
	
	
	
}