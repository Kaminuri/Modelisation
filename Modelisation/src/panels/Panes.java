package panels;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import publics.Const;
import entity.Face;

public class Panes extends JPanel{
	ArrayList<Face> f;
	public Panes(){
		f = new ArrayList<>();
		f = Const.faces;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Face r : f){
			//g.drawPolygon(r.x, arg1, arg2);
		}
	}
}
