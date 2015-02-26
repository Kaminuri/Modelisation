package views;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JDesktopPane;

import loader.FileLoader;
import publics.Const;
import entity.Segment;

public class Displayz extends JDesktopPane{

	//Chacal !

	public Displayz(){
		FileLoader f = new FileLoader();
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		for (Segment seg : Const.segments) {
			g2.draw(new Line2D.Double(seg.getP1().getX(), seg.getP1().getY(), seg.getP2().getX(), seg.getP2().getY()));
		}
	}
}
