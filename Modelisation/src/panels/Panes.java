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
	ArrayList<Segment> s;
	Point a;
	Point b;
	Segment s1;
	Segment s2;
	Segment s3;
	Face f;
	public Panes(){
		FileLoader fl = new FileLoader();
		/*a = new Point(5, 10, 0);
		b = new Point(10, 30, 0);
		p = new Segment(a, b);
		
		p = s.get(0);*/
		s = Const.segments;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		/*for(Segment t : s){
			a = t.getP1();
			b =t.getP2();
			g.drawLine((int)a.getX(),(int)a.getY(), (int)b.getX(), (int)b.getY());
			System.out.println("Printed");
		}*/
		//g.drawLine((int)a.getX(),(int)a.getY(), (int)b.getX(), (int)b.getY());
	}
}
