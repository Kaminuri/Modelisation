package panels;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import loader.FileLoader;
import publics.Const;
import entity.Face;
import entity.Point;
import entity.Segment;

public class Panes extends JPanel{
	Point a;
	Point b;
	public Panes(){
		FileLoader fl = new FileLoader();
		a = new Point(5, 10, 0);
		b = new Point(10, 30, 0);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//g.drawLine((int)a.getX(),(int)a.getY(), (int)b.getX(), (int)b.getY());
	}
}
