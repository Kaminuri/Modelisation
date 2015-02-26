package views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

import loader.FileLoader;
import entity.Segment;
import publics.Const;

public class Displayz extends JPanel{

	//Chacal !

	public Displayz(){
		FileLoader f = new FileLoader();
	}
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		for (Segment seg : Const.segments) {
			
			g2.draw(new Line2D.Double(seg.getP1().getX(), seg.getP1().getY(), seg.getP2().getX(), seg.getP2().getY()));
		}



	}
}
