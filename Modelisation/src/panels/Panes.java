package panels;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import publics.Const;
import entity.Face;
import entity.Segment;

public class Panes extends JPanel{
	ArrayList<Segment> s;
	Segment p;
	public Panes(){
		s = Const.segments;
		p = s.get(0);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		/*for(Face r : f){
			g.drawPolygon(r.x, arg1, arg2);
		}*/
	}
}
