package panels;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import publics.Const;
import entity.Face;
import entity.Point;
import entity.Segment;

public class Panes extends JPanel{
	ArrayList<Segment> s;
	Point a;
	Point b;
	Segment p;
	public Panes(){
		a = new Point(5, 10, 0);
		b = new Point(10, 30, 0);
		p = new Segment(a, b);
		/*s = Const.segments;
		p = s.get(0);*/
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		/*for(Face r : f){
			g.drawPolygon(r.x, arg1, arg2);
		}*/
		g.drawLine((int)a.getX(),(int)a.getY(), (int)b.getX(), (int)b.getY());
	}
}
